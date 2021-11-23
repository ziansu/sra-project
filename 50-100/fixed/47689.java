public long getEmployeeID(java.lang.String employeeName) {
    for (int i = 0; i < (employees.size()); i++) {
        if (employeeName.equals(employees.get(i).name)) {
            return employees.get(i).id;
        }
    }
    return -1;
}