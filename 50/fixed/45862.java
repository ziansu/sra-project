protected nl.knaw.huygens.timbuctoo.vre.RelationSearchParameters createRelationSearchParameters(java.lang.String typeString, java.lang.String sourceSearchId, java.lang.String targetSearchId, java.util.List<java.lang.String> relationTypeIds) {
    nl.knaw.huygens.timbuctoo.vre.RelationSearchParameters parameters = createSearchParameters(typeString, sourceSearchId, targetSearchId);
    parameters.setRelationTypeIds(relationTypeIds);
    return parameters;
}