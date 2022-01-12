public void addCourse(java.lang.String courseCode, int units, java.lang.String grade) {
    courses.add(new CourseEnrollment(courseCode, units, grade.toUpperCase()));
}