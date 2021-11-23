public static void updateEmployee() {
    java.lang.System.out.println("Update Employee");
    java.lang.Integer rows = com.exercise6.core.dao.EmployeeDAO.showEmployees(1);
    java.lang.System.out.print("Choose Employee ID to be updated: ");
    java.lang.Integer employeeId = com.exercise6.util.InputUtil.inputOptionCheck();
    while (!(com.exercise6.core.dao.EmployeeDAO.employeeCheck(employeeId))) {
        java.lang.System.out.print("Employee ID chosen does not exist. Enter a new employee id to delete: ");
        employeeId = com.exercise6.util.InputUtil.inputOptionCheck();
    } 
    com.exercise6.core.dao.EmployeeDAO.employeeUpdate(employeeId);
}