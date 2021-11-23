public void loadStudents(java.lang.String studentsDir, java.lang.String studentsFADir) throws java.io.FileNotFoundException, java.io.IOException {
    this.studentsDir = studentsDir;
    this.studentsFADir = studentsFADir;
    studentsIO = new io.match.reader.PeopleIO(studentsDir, studentsFADir, getAttributes());
    students = studentsIO.getPeople();
}