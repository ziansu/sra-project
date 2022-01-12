public com.mongodb.DB getDBWithAdminCommandOnCreation(java.lang.String dbname, com.mongodb.DBObject cmd) {
    com.mongodb.DB db = _dbs.get(dbname);
    if (db != null)
        return db;
    
    db = new com.mongodb.DBApiLayer(this, dbname, _connector);
    com.mongodb.DB temp = _dbs.putIfAbsent(dbname, db);
    if ((cmd != null) && (temp == null)) {
        getDB("admin").command(cmd);
    }
    if (temp != null)
        return temp;
    
    return db;
}