private java.util.List<com.enonic.xp.admin.impl.rest.resource.content.json.AccessControlEntryJson> aclToJson(final com.enonic.xp.security.acl.AccessControlList acl, final com.enonic.xp.security.Principals principals) {
    final java.util.List<com.enonic.xp.admin.impl.rest.resource.content.json.AccessControlEntryJson> jsonList = new java.util.ArrayList<>();
    for (com.enonic.xp.security.acl.AccessControlEntry entry : acl) {
        if ((principals.getPrincipal(entry.getPrincipal())) != null)
            jsonList.add(new com.enonic.xp.admin.impl.rest.resource.content.json.AccessControlEntryJson(entry, principals.getPrincipal(entry.getPrincipal())));
        
    }
    return jsonList;
}