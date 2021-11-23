public static void updateContactInfo() {
    java.lang.Integer rows = com.exercise6.core.dao.EmployeeDAO.showEmployees(1);
    java.lang.Integer employeeId;
    java.lang.System.out.print("Update contact info of which employee: ");
    employeeId = com.exercise6.util.InputUtil.inputOptionCheck();
    while (!(com.exercise6.core.dao.EmployeeDAO.employeeCheck(employeeId))) {
        java.lang.System.out.print("Employee ID chosen does not exist. Enter a new employee id to delete: ");
        employeeId = com.exercise6.util.InputUtil.inputOptionCheck();
    } 
    java.lang.Integer contacts = com.exercise6.core.dao.ContactDAO.employeeContact(employeeId);
    java.lang.System.out.print("Choose the ContactID to be updated: ");
    java.lang.Integer contactID = com.exercise6.util.InputUtil.inputOptionCheck();
    com.exercise6.core.dao.ContactDAO.updateContact(contactID, employeeId);
}