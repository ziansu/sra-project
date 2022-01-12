public java.lang.String getGradeLevel(int level) {
    java.lang.String studentList = "";
    for (Student s : students) {
        if ((s.getLevel()) == 12) {
            studentList += (s.toString()) + "\n";
        }
    }
    return studentList;
}