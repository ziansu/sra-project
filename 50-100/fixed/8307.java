public gov.anl.aps.cdb.portal.model.db.entities.ItemElementRelationship findConnectionRelationship(java.util.List<gov.anl.aps.cdb.portal.model.db.entities.ItemElementRelationship> ierList) {
    java.lang.String relationshipTypeName = ItemElementRelationshipTypeNames.itemCableConnection.getValue();
    for (gov.anl.aps.cdb.portal.model.db.entities.ItemElementRelationship ittrIER : ierList) {
        if (ittrIER.getRelationshipType().getName().equals(relationshipTypeName)) {
            return ittrIER;
        }
    }
    return null;
}