@com.google.common.eventbus.Subscribe
public void attemptToMatchSubmissionWithStudent(edu.pdx.cs410J.grader.poa.POASubmissionSelected selected) {
    for (int i = 0; i < (students.size()); i++) {
        edu.pdx.cs410J.grader.Student student = students.get(i);
        if (submitterMatchesStudent(selected.getSubmission(), student)) {
            this.view.setSelectedStudentIndex((i + 1));
            fireStudentSelectedEvent(student);
            return ;
        }
    }
    this.view.setSelectedStudentIndex(0);
    fireStudentSelectedEvent(null);
}