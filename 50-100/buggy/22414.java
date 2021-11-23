@java.lang.Override
public boolean createTenantProfile(com.flatshare.domain.datatypes.db.profiles.TenantUserProfile tenantUserProfile) {
    java.lang.String tenantId = databaseManager.push(tenantUserProfile, tenantProfilesPath);
    if (tenantId == null) {
        return false;
    }
    return databaseManager.create(tenantId, (((((userPath) + "/") + (userId)) + "/") + "tenant_profile_id"));
}