public static void main(java.lang.String[] args) {
    performance.Query mysql = new performance.MySQLQuery();
    mysql.run();
    performance.Query sqlQuery = new performance.MysqlQuery();
    sqlQuery.initSQLConnection();
    sqlQuery.managerSalaries();
}