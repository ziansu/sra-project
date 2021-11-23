@java.lang.Override
public com.wci.umls.server.model.meta.AttributeIdentity getAttributeIdentity(java.lang.Long id) throws java.lang.Exception {
    org.apache.log4j.Logger.getLogger(getClass()).debug(("Umls Identity Service - get attribute identity " + id));
    return getObject(id, com.wci.umls.server.model.meta.AttributeIdentity.class);
}