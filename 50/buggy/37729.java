public static boolean isEmployeeExsit(java.lang.String employeeName, java.lang.String team) throws java.sql.SQLException {
    com.ob.dailyReport.model.Employee employee = com.ob.dailyReport.dao.EmployeeDao.getEmployee(employeeName, team);
    if (employee != null) {
        return true;
    }
    return false;
}