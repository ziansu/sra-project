@org.junit.Test
public void getAllByGenderReturnsStudentsOfThatGender() {
    csd4464.a2.Course c = new csd4464.a2.Course(defaultStudentList);
    csd4464.a2.Course expectedList = new csd4464.a2.Course();
    for (csd4464.a2.Student s : defaultStudentList) {
        if ((s.gender) == "Male") {
            expectedList.add(s);
        }
    }
    assertEquals(c.getAllByGender("Male"), expectedList);
}