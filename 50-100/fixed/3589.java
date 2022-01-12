public static void insertIntoWorkTracking(java.lang.String date, int workingHours, int employeesId) {
    final int objectEmployeesId = employees.attendance.table.ODBC_PubsBD.selectObjectEmployeesId(date, employeesId);
    java.lang.System.out.println(objectEmployeesId);
    sample.DB_Connector.getJdbcTemplate().update(((((((("INSERT INTO worktracking (id, object_employees_id, date, workingHours) " + "VALUES (null, '") + objectEmployeesId) + "', convert('") + date) + "', DATE), '") + workingHours) + "')"));
}