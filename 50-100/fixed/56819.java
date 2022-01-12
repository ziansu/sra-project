public void onStudentChange() {
    student = studentFacade.find(studentMB.getId());
    listIsEmpty = courseMB.getAttendancelistList().isEmpty();
    for (com.rappandpoppa.entities.Attendancelist a : courseMB.getAttendancelistList()) {
        if (a.getStudentList().contains(student)) {
            datesAttendedByStudent.add(a.getAttendanceDate());
        }
    }
    setAttendedDatesForStudent();
}