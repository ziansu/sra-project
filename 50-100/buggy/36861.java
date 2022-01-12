@java.lang.Override
public org.opencb.datastore.core.QueryResult<org.opencb.opencga.catalog.models.Individual> delete(java.lang.Integer individualId, org.opencb.datastore.core.QueryOptions options, java.lang.String sessionId) throws org.opencb.opencga.catalog.exceptions.CatalogException {
    org.opencb.opencga.catalog.utils.ParamUtils.checkObj(sessionId, "sessionId");
    org.opencb.opencga.catalog.utils.ParamUtils.defaultObject(options, QueryOptions::new);
    int studyId = individualDBAdaptor.getStudyIdByIndividualId(individualId);
    java.lang.String userId = super.userDBAdaptor.getUserIdBySessionId(sessionId);
    authorizationManager.checkIndividualPermission(studyId, userId, CatalogPermission.DELETE);
    return individualDBAdaptor.deleteIndividual(individualId, options);
}