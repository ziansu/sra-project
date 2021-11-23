public static com.Mysql getInstance() throws java.lang.ClassNotFoundException, java.sql.SQLException {
    if ((com.Mysql.mysql) == null)
        com.Mysql.mysql = new com.Mysql();
    
    return com.Mysql.mysql;
}