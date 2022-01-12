private boolean isValidUser(java.lang.String uname, java.lang.String pword) {
    for (CS3450.course_project.dataAccess.Employee x : databaseConnection.getEmployeeList()) {
        java.lang.System.out.println(((("Employee: " + (x.getName())) + " ") + (x.getPassword())));
        if ((x.getName().equals(uname)) && (x.getPassword().equals(pword))) {
            return true;
        }
    }
    return false;
}