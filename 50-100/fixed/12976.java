@org.junit.Test
public void testRemove() {
    Person test10 = new Person("Dave", "Son");
    Course course2 = new Course("3010", "SYSC");
    test10.remove(course2);
    Course[] array2 = test10.getCourses();
    if ((array2.length) != 0) {
        fail("Remove for the course didn't work");
    }
}