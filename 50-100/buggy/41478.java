public java.util.List<com.josh.dundermifflin.web.controller.model.EmployeeForm> listEmployees() {
    java.util.List<com.josh.dundermifflin.dao.entity.Employee> employeeList = employeeDao.listEmployees();
    java.util.List<com.josh.dundermifflin.web.controller.model.EmployeeForm> employeeFormList = new java.util.ArrayList<com.josh.dundermifflin.web.controller.model.EmployeeForm>();
    for (com.josh.dundermifflin.dao.entity.Employee employee : employeeList) {
        com.josh.dundermifflin.web.controller.model.EmployeeForm employeeForm = new com.josh.dundermifflin.web.controller.model.EmployeeForm();
        org.springframework.beans.BeanUtils.copyProperties(employeeForm, employee);
        employeeFormList.add(employeeForm);
    }
    return employeeFormList;
}