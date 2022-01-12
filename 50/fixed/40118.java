@java.lang.Override
public int addCourse(java.lang.String courseCode, java.lang.String name) {
    no.uio.inf5750.assignment2.model.Course course = new no.uio.inf5750.assignment2.model.Course(courseCode, name);
    return courseDao.saveCourse(course);
}