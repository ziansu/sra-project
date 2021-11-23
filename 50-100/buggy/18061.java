public static Employee createEmployee(java.lang.String username) {
    switch (EmployeeFactory.getType(username)) {
        case Employee.DOCTOR :
            return new Doctor(username);
            break;
        case Employee.TECHNICIAN :
            return new Technician(username);
            break;
        case Employee.ADMINISTRATOR :
            return new Admin(username);
            break;
        default :
            break;
    }
}