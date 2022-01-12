@org.junit.Test
public void doubleEnrollingInFullCourseHasNoEffect() {
    sally.enrollIn(comp225);
    factory.enrollMultipleStudents(comp225, 20);
    assertTrue(sally.enrollIn(comp225));
    assertTrue(comp225.getStudents().contains(sally));
    assertFalse(comp225.getWaitList().contains(sally));
    java.lang.System.out.println(comp225.getWaitList().contains(sally));
}