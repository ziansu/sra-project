void drop(edu.macalester.registrar.Student student) {
    students.remove(student);
    waitList.get(0).enrollIn(this);
    waitList.remove(0);
}