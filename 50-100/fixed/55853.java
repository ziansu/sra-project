public static void listEmployeeRoles() {
    java.lang.Integer rows = com.exercise6.core.dao.EmployeeDAO.showEmployees(1);
    java.lang.Integer employeeId;
    java.lang.System.out.print("Show the roles of which EmployeeId: ");
    employeeId = com.exercise6.util.InputUtil.inputOptionCheck();
    while (!(com.exercise6.core.dao.EmployeeDAO.employeeCheck(employeeId))) {
        java.lang.System.out.print("Employee ID chosen does not exist. Enter a new employee id to delete: ");
        employeeId = com.exercise6.util.InputUtil.inputOptionCheck();
    } 
    java.lang.Integer roleNumber = com.exercise6.core.dao.EmployeeDAO.showEmployeeRoles(employeeId);
}