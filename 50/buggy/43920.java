public void setStudentByCourseId(java.lang.String courseId, boolean useDraft) {
    this.courseId = courseId;
    list = getAllStudentByCourseId(courseId, useDraft);
    fireTableDataChanged();
}