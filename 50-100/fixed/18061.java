public static Employee createEmployee(java.lang.String username) {
    switch (EmployeeFactory.getType(username)) {
        case Employee.DOCTOR :
            return new Doctor(username);
        case Employee.TECHNICIAN :
            return new Technician(username);
        case Employee.ADMINISTRATOR :
            return new Admin(username);
        default :
            return null;
    }
}