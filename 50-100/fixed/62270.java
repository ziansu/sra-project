public java.lang.String getGradeLevel(int level) {
    java.lang.String studentList = "";
    for (Student s : students) {
        if ((s.getLevel()) == level) {
            studentList += (s.toString()) + "\n";
        }
    }
    return studentList;
}