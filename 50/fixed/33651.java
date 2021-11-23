public attendance.automation.be.Student getStudentInfo(java.lang.String userName) throws java.sql.SQLException {
    attendance.automation.be.Student studentReturn = securityDB.getStudentByName(userName);
    studentReturn.setSemester(studentDB.loadSemester(studentReturn.getId()));
    return studentReturn;
}