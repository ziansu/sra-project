void drop(edu.macalester.registrar.Student student) {
    students.remove(student);
    if (!(waitList.isEmpty())) {
        waitList.get(0).enrollIn(this);
        waitList.remove(0);
    }
}