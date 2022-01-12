@org.junit.Test
public void equalsIsObjectButNotEqualReturnsFalse() {
    csd4464.a2.Course c = new csd4464.a2.Course(defaultStudentList);
    csd4464.a2.Course differentCourse = new csd4464.a2.Course();
    differentCourse.add(new csd4464.a2.Student("Kim", "S7838", "Female", 87));
    differentCourse.add(new csd4464.a2.Student("Kyle", "S1347", "Male", 64));
    differentCourse.add(new csd4464.a2.Student("Katie", "S1282", "Female", 73));
    assertEquals(c.equals(differentCourse), false);
}