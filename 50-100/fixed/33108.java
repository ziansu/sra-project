private void setParentIdentifierRelation(fi.otavanopisto.kuntaapi.server.persistence.model.Identifier parentIdentifier, fi.otavanopisto.kuntaapi.server.persistence.model.Identifier childIdentifier) {
    boolean parentFound = false;
    for (fi.otavanopisto.kuntaapi.server.persistence.model.IdentifierRelation identifierRelation : identifierRelationDAO.listByChild(childIdentifier)) {
        fi.otavanopisto.kuntaapi.server.persistence.model.Identifier relationParentIdentifier = identifierRelation.getParent();
        if ((relationParentIdentifier != null) && (relationParentIdentifier.getId().equals(parentIdentifier.getId()))) {
            parentFound = true;
        }else {
            identifierRelationDAO.delete(identifierRelation);
        }
    }
    if (!parentFound) {
        identifierRelationDAO.create(parentIdentifier, childIdentifier);
    }
}