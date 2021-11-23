@org.junit.Test
public void test() {
    upandgo.server.CoursesServiceImpl course = new upandgo.server.CoursesServiceImpl();
    assertEquals("emptyWe have got our credentials!", course.getSomeString());
}