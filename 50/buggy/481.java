@org.junit.Test
public void testGenerateInitialSolutions() throws java.lang.Exception {
    java.lang.Object[][] solutions = _provider.generateInitialSolutions(_problemInstance, 10, 10);
    assertNotNull(solutions);
}