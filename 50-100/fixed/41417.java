protected Course createCourse(java.lang.String courseType, java.lang.String n, java.lang.Double f, java.lang.String u, java.lang.String s, java.lang.String semester, java.lang.Double duration, java.lang.Double credits, java.lang.String certification, java.lang.String instructor) {
    SemesterCourse sc = new SemesterCourse(courseType, n, f, u, s, semester, duration, credits, certification, instructor);
    return sc;
}