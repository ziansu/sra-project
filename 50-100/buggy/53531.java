static void printSeminarInfo() {
    int count = 0;
    int lockedCount;
    for (java.util.Map.Entry<java.lang.Integer, Student> entry : Driver.students.entrySet()) {
        Student stu = entry.getValue();
        if (stu.hasSeminarCourse())
            count++;
        
    }
    java.lang.System.out.println(("Number of students in a seminar course: " + count));
}