private static void lockAllStudentSeminarCourses() {
    for (java.util.Map.Entry<java.lang.Integer, Student> entry : Driver.students.entrySet()) {
        Student stud = entry.getValue();
        for (Course c : stud.courses) {
            if (c.isSeminar()) {
                stud.lockCourse(c.getID());
                break;
            }
        }
    }
}