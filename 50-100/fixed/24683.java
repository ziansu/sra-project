@java.lang.Override
public javax.ws.rs.core.Response findGroupIdRecordByName(java.lang.String name) {
    orcidSecurityManager.checkScopes(ScopePathType.GROUP_ID_RECORD_READ);
    java.util.Optional<org.orcid.jaxb.model.groupid_v2.GroupIdRecord> record = groupIdRecordManager.findGroupIdRecordByName(name);
    if (record.isPresent())
        return javax.ws.rs.core.Response.ok(record.get()).build();
    
    return javax.ws.rs.core.Response.ok(new org.orcid.jaxb.model.groupid_v2.GroupIdRecord()).build();
}