@org.junit.Test
public void TestCourseConstructionDB() {
    logic.Course course = new logic.Course(50, "test course", "Description of test course.");
    course.save();
    logic.Course fromDB = new logic.Course(course.courseID);
    assertEquals(course, fromDB);
    course.delete();
}