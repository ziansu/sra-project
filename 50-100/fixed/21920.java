private teammates.common.datatransfer.StudentAttributes getStudentAndTeammates(java.lang.String courseId, java.lang.String userEmail, teammates.common.datatransfer.UserType.Role role, java.util.Set<java.lang.String> studentsEmailInTeam) {
    teammates.common.datatransfer.StudentAttributes student = null;
    if (role == (teammates.common.datatransfer.UserType.Role.STUDENT)) {
        student = teammates.logic.core.FeedbackSessionsLogic.studentsLogic.getStudentForEmail(courseId, userEmail);
        java.util.List<teammates.common.datatransfer.StudentAttributes> studentsInTeam = teammates.logic.core.FeedbackSessionsLogic.studentsLogic.getStudentsForTeam(student.team, courseId);
        for (teammates.common.datatransfer.StudentAttributes teammates : studentsInTeam) {
            studentsEmailInTeam.add(teammates.email);
        }
    }
    return student;
}