private void fireSelectedStudentEventForStudentAtIndex(int index) {
    edu.pdx.cs410J.grader.Student student = this.students.get(index);
    fireStudentSelectedEvent(student);
}