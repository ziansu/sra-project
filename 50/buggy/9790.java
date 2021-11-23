boolean isMatchedWith(Student s, Lecturer l) {
    return studentsProject.get(s).getLecturer().equals(l);
}