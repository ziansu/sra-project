public void enrollTeacher(User newTeacher) {
    teacher = newTeacher;
    newTeacher.addClassToTeach(this);
}