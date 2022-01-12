public void removeEmployee(java.lang.String employeeID) {
    for (int i = 0; i < (employees.size()); i++) {
        if (employeeName.equals(employees.get(i).name)) {
            employees.remove(i);
        }
    }
}