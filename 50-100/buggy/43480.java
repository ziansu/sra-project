@org.junit.Test
public void insertStudentAtIndexShouldInsertStudent() {
    csd4464.a2.Course c = new csd4464.a2.Course(defaultStudentList);
    java.util.List<csd4464.a2.Student> expectedList = new java.util.LinkedList<>();
    expectedList = defaultStudentList;
    c.insert(new csd4464.a2.Student("Judy", "S1328", "Female", 73), 2);
    expectedList.add(2, new csd4464.a2.Student("Judy", "S1328", "Female", 73));
    assertEquals(c.getAll(), expectedList);
}