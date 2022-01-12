@java.lang.Override
public void after() {
    assertEquals(1, allTestsCount());
    assertEquals(1, passedTestsCount());
}