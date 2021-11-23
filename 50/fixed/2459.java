public static org.spideruci.tacoco.db.DBUtil getInstance(java.lang.String dbFile) {
    org.spideruci.tacoco.db.DBUtil.instance = new org.spideruci.tacoco.db.DBUtil(dbFile);
    return org.spideruci.tacoco.db.DBUtil.instance;
}