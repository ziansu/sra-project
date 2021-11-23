private void addTenantAdminUser(org.wso2.carbon.user.core.tenant.Tenant tenant) throws java.lang.Exception {
    org.wso2.carbon.user.core.service.RealmService realmService = org.wso2.carbon.tenant.mgt.core.internal.TenantMgtCoreServiceComponent.getRealmService();
    try {
        realmService.getTenantManager().getTenant(tenant.getId()).getRealmConfig().setAdminPassword(tenant.getAdminPassword());
        realmService.getTenantUserRealm(tenant.getId());
    } catch (org.wso2.carbon.tenant.mgt.core.UserStoreException e) {
        java.lang.String msg = "Error in creating Realm for tenant: " + (tenant.getDomain());
        org.wso2.carbon.tenant.mgt.core.TenantPersistor.log.error(msg);
        throw new java.lang.Exception(msg, e);
    }
}