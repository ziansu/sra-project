public static void removeEmployeeRoles() {
    java.lang.Integer rows = com.exercise6.core.dao.EmployeeDAO.showEmployees(1);
    java.lang.Integer employeeId;
    java.lang.System.out.print("Delete the roles of which employee:");
    employeeId = com.exercise6.util.InputUtil.inputOptionCheck();
    while (!(com.exercise6.core.dao.EmployeeDAO.employeeCheck(employeeId))) {
        java.lang.System.out.println("Employee ID chosen does not exist. Enter a new employee id to delete: ");
        employeeId = com.exercise6.util.InputUtil.inputOptionCheck();
    } 
    java.lang.Integer roleNumber = com.exercise6.core.dao.EmployeeDAO.showEmployeeRoles(employeeId);
    java.lang.System.out.print("Choose the RoleCode to Delete: ");
    java.lang.String roleCode = com.exercise6.util.InputUtil.getRequiredInput();
    java.lang.Integer deleted = com.exercise6.core.dao.EmployeeDAO.deleteEmployeeRoles(roleCode);
}