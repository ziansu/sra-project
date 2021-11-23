public static boolean updateStudentState(models.User user) {
    helper.HMSAccessor hms = new helper.HMSAccessor();
    if (hms.identifyUser(user.getEmail())) {
        user.setStudent(true);
        user.setyID(hms.getResults().get("ynumber"));
        user.setMatNR(hms.getResults().get("matnumber"));
        return true;
    }
    return false;
}