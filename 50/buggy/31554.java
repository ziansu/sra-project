@java.lang.Override
public int manageUserAccess(com.psk.pms.model.Employee employee) {
    int status = employeeDAO.manageUserAccess(employee);
    mailClient.sendAccessMail(employee.getEmployeeMail(), employee.getEmployeeId(), employee.getEnabled());
    return status;
}