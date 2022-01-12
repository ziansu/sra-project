@org.junit.Test
public void removeStudentFromCourseShouldRemoveStudent() {
    csd4464.a2.Course c = new csd4464.a2.Course(defaultStudentList);
    java.util.List<csd4464.a2.Student> expectedList = new java.util.ArrayList<>();
    expectedList = defaultStudentList;
    if (expectedList.remove(new csd4464.a2.Student("John", "S9737", "Male", 83))) {
        c.remove(new csd4464.a2.Student("John", "S9737", "Male", 83));
        assertEquals(c.getAll(), expectedList);
    }else
        fail("The expected list didn't have the 'John' student element? Tell Matt");
    
}