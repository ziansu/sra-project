public void checkID(java.lang.String studentID) {
    java.lang.System.out.println(studentID);
    if (aGradeSystem.containsID(studentID)) {
        showWelcomeMsg();
        userID = studentID;
        promptCommand();
    }else {
        showErrorMsg();
    }
}