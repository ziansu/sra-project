public void enrollStudent(User student) {
    students.add(student);
    student.addClassToTake(this);
}