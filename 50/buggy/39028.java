public void enrollTeacher(User newTeacher) {
    teacher = newTeacher;
    newTeacher.addClassToTeach(this);
    connectedClasses.addAll(teacher.getAllClasses());
}