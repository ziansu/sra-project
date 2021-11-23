public static com.ivenhov.permcheck.PermissionNameSet from(com.ivenhov.permcheck.PermissionNameSet existing, com.ivenhov.permcheck.PermissionName... toAdd) {
    java.util.EnumSet<com.ivenhov.permcheck.PermissionName> pns;
    if (existing == null) {
        pns = com.ivenhov.permcheck.PermissionNameSet.newSetWith(null, toAdd);
    }else {
        pns = com.ivenhov.permcheck.PermissionNameSet.newSetWith(existing.set, toAdd);
    }
    com.ivenhov.permcheck.PermissionNameSet newset = new com.ivenhov.permcheck.PermissionNameSet(pns);
    return newset;
}