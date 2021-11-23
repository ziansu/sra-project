@org.junit.Test
public void noArgsConstructorAddThenGetAllReturnsAdd() {
    csd4464.a2.Course c = new csd4464.a2.Course();
    c.add(defaultStudentList.get(2));
    java.util.List<csd4464.a2.Student> expectedList = new java.util.ArrayList<>();
    expectedList.add(defaultStudentList.get(2));
    assertEquals(c.getAll(), expectedList);
}