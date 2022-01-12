public Employee addEmployee(java.lang.String id) {
    Employee employee = new Employee(id);
    employees.put(employee.id, employee);
    return employee;
}