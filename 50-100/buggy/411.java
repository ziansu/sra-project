@org.junit.Test
public void testCase6() throws java.io.IOException, org.isaacphysics.labs.graph.checker.CheckerException, org.json.simple.parser.ParseException {
    java.lang.String trustedJSONString = org.isaacphysics.labs.graph.checker.WholeFileReader.readFile("/Users/YUAN/Documents/workspace/isaac-graph-checker/src/main/json/trusted6.json");
    java.lang.String untrustedJSONString = org.isaacphysics.labs.graph.checker.WholeFileReader.readFile("/Users/YUAN/Documents/workspace/isaac-graph-checker/src/main/json/untrusted6.json");
    fail("expected CheckerExcepiton: Invalid JSON format");
    thrown.expect(org.isaacphysics.labs.graph.checker.CheckerException.class);
    thrown.expectMessage("Invalid JSON: incorrect format");
    java.lang.String resultJSONString = org.isaacphysics.labs.graph.checker.Checker.test(trustedJSONString, untrustedJSONString);
}