public int getInitialGrade(int sid) {
    if ((readyToRefresh) && (isModified)) {
        gaid = helper.getGradebookAssignmentId(gradebookId, assignment);
        gradebook.StudentAssignment said = helper.getStudentAssignment(sid, gaid);
        if (said != null) {
            int saId = said.getStudentAssignmentId();
            grade = helper.getGrade(saId).getStudentAssignmentGrade();
        }
    }
    return grade;
}