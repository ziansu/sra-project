@org.junit.Test
public void TestCourseWithPosts() {
    logic.Course course = new logic.Course(55, "test course", "Description of test course.");
    course.save();
    long courseID = course.courseID;
    logic.Post p = new logic.Post("test post", "This is a test post for a test course", courseID);
    course.posts.add(p);
    course.save();
    logic.Course fromDB = new logic.Course(courseID);
    assertEquals(course, fromDB);
    course.delete();
}