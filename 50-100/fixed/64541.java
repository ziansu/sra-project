public static int getType(java.lang.String username) {
    int type = Employee.DOCTOR;
    boolean isCorrectType = EmployeeFactory.tryQuery("Doctors", username);
    if (!isCorrectType) {
        type = Employee.TECHNICIAN;
        isCorrectType = EmployeeFactory.tryQuery("Technicians", username);
        if (!isCorrectType) {
            type = Employee.ADMINISTRATOR;
        }
    }
    return type;
}