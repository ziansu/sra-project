public void toDb(net.eithon.library.mysql.Database database) throws java.lang.ClassNotFoundException, java.sql.SQLException {
    java.lang.String updates = getDbUpdates();
    java.lang.String update = java.lang.String.format("UPDATE accumulated SET %s WHERE id=%d", updates, this._dbId);
    java.sql.Statement statement = database.getOrOpenConnection().createStatement();
    statement.executeUpdate(update);
}