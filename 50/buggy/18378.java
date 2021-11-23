@java.lang.Override
public void after() {
    assertEquals(5, allTestsCount());
    assertEquals(3, passedTestsCount());
}