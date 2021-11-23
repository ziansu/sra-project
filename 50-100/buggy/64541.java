public static int getType(java.lang.String username) {
    int type = Employee.DOCTOR;
    try {
        boolean isCorrectType = EmployeeFactory.tryQuery("Doctors", username);
        if (!isCorrectType) {
            type = Employee.TECHNICIAN;
            isCorrectType = EmployeeFactory.tryQuery("Technicians", username);
            if (!isCorrectType) {
                isCorrectType = Employee.ADMINISTRATOR;
            }
        }
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    return type;
}