@org.junit.Test
public void removeStudentByListIndexFromCourseShouldRemoveStudent() {
    csd4464.a2.Course c = new csd4464.a2.Course(defaultStudentList);
    java.util.List<csd4464.a2.Student> expectedList = new java.util.ArrayList<>();
    expectedList = defaultStudentList;
    expectedList.remove(2);
    c.remove(2);
    assertEquals(c.getAll(), expectedList);
}