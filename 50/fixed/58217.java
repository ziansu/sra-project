@java.lang.Override
public void removeSemanticTypeComponentIdentity(long semanticTypeComponentIdentityId) throws java.lang.Exception {
    org.apache.log4j.Logger.getLogger(getClass()).debug(("Umls Identity Service - remove semanticTypeComponent identity " + semanticTypeComponentIdentityId));
    final com.wci.umls.server.model.meta.SemanticTypeComponentIdentity identity = getSemanticTypeComponentIdentity(semanticTypeComponentIdentityId);
    removeObject(identity);
}