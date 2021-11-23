com.winthier.perm.PermPlugin.Cache loadCache() {
    com.winthier.perm.PermPlugin.Cache newCache = new com.winthier.perm.PermPlugin.Cache();
    newCache.groups = db.find(com.winthier.perm.SQLGroup.class).findList();
    newCache.members = db.find(com.winthier.perm.SQLMember.class).findList();
    newCache.permissions = db.find(com.winthier.perm.SQLPermission.class).findList();
    newCache.version = db.find(com.winthier.perm.SQLVersion.class).findUnique();
    return newCache;
}