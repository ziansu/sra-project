public static boolean verifyPassword(java.lang.String registrationNo, java.lang.String password) throws java.lang.Exception {
    me.shafin.sustord.model.StudentInfo studentInfo = me.shafin.sustord.dao.StudentInfoDao.getStudentInfoObject(registrationNo);
    java.lang.String existingPassword = studentInfo.getPassword();
    return password.equals(existingPassword);
}