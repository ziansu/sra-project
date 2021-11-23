public void addNewEmployee(com.inexisconsulting.dao.Employee employee) {
    if (checkEmpExists(employee)) {
        session().saveOrUpdate(employee);
        com.inexisconsulting.dao.EmployeeDAO.employeeInsertedKey = employee.getEmpId();
        java.lang.System.err.println(com.inexisconsulting.dao.EmployeeDAO.employeeInsertedKey);
        com.inexisconsulting.dao.EmployeeDAO.getEmpId();
    }
}