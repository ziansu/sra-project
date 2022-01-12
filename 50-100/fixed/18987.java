private void addTenantAdminUser(org.wso2.carbon.user.core.tenant.Tenant tenant) throws java.lang.Exception {
    org.wso2.carbon.user.core.service.RealmService realmService = org.wso2.carbon.tenant.mgt.core.internal.TenantMgtCoreServiceComponent.getRealmService();
    realmService.getTenantManager().getTenant(tenant.getId()).getRealmConfig().setAdminPassword(tenant.getAdminPassword());
    realmService.getTenantUserRealm(tenant.getId());
}