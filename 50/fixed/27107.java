@org.junit.Test(expected = java.lang.UnsupportedOperationException.class)
public void testWithPath() {
    org.neo4j.driver.v1.types.Path nullPath = null;
    iethw.neo4j.driver.util.PrettyPrinter.toString(nullPath);
}