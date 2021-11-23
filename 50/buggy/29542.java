public java.util.List<org.qimei.training.pojo.Employee> getEmpById(int empId) throws java.sql.SQLException {
    return org.qimei.training.db.EmployeeManagementDBManager.getInstance().getEmpDao().queryForEq("empId", empId);
}