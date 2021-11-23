@org.junit.experimental.theories.Theory
public void testProject(final java.lang.Object... testData) throws java.lang.Exception {
    np.parse(((java.lang.String) (testData[0])));
    ast.cc.interfaces.CCNode graph = np.extract();
    assertEquals(testData[1], graph.toString());
    java.lang.System.out.println(((("Network: " + (testData[0])) + "\nGraph: ") + (graph.toString())));
}