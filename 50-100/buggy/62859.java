private java.lang.String getDefaultTenant() {
    org.oscm.dataservice.bean.TypedQuery<org.oscm.dataservice.bean.ConfigurationSetting> query = em.createNamedQuery("ConfigurationSetting.findByInfoAndContext", org.oscm.dataservice.bean.ConfigurationSetting.class);
    query.setParameter("informationId", ConfigurationKey.SSO_DEFAULT_TENANT_ID);
    query.setParameter("contextId", Configuration.GLOBAL_CONTEXT);
    try {
        return query.getSingleResult().getValue();
    } catch (java.lang.Exception exc) {
        throw new java.lang.RuntimeException("Missing mandatory setting: SSO_DEFAULT_TENANT_ID");
    }
}