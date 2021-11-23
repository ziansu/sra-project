@org.junit.Test
public void unlinkStudentCourse_nominal() throws cst338.p1.EntityDuplicateException, cst338.p1.EntityNotFoundException {
    cst338.p1.Database db = new cst338.p1.Database();
    linkStudentCourse_nominal_core(db);
    db.unlinkStudentCourse(1000, 2000);
    java.util.List<cst338.p1.StudentRecord> courseStudents = db.getStudentsForCourse(2000).collect(java.util.stream.Collectors.toList());
    assertEquals(0, courseStudents.size());
    java.util.List<cst338.p1.CourseRecord> studentCourses = db.getCoursesForStudent(1000).collect(java.util.stream.Collectors.toList());
    assertEquals(0, studentCourses.size());
}