public static com.ob.dailyReport.model.Employee getEmployee(java.lang.String employeeName, java.lang.String team) throws java.sql.SQLException {
    com.ob.dailyReport.model.Employee employee = com.ob.dailyReport.dao.EmployeeDao.getEmployee(employeeName, team);
    return employee;
}