@java.lang.Override
public void onEnable() {
    readConfiguration();
    db = new com.winthier.sql.SQLDatabase(this);
    db.registerTables(com.winthier.perm.SQLGroup.class, com.winthier.perm.SQLMember.class, com.winthier.perm.SQLPermission.class, com.winthier.perm.SQLVersion.class);
    db.createAllTables();
    getServer().getPluginManager().registerEvents(this, this);
    refreshPermissions();
}