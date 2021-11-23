@org.junit.runners.Parameterized.Parameters(name = "{index}: {0}")
public static java.lang.Iterable<java.lang.Object[]> data() {
    java.util.HashSet<java.lang.String> skip = new java.util.HashSet<java.lang.String>(java.util.Arrays.asList(new java.lang.String[]{ "99220-pass-00-01-sev1-l2v1.xml" , "99220-pass-00-02-sev1-l2v2.xml" , "99220-pass-00-03-sev1-l2v3.xml" }));
    skip = null;
    java.lang.String filter = "pass";
    return org.cy3sbml.TestUtils.findResources(TestUtils.SBMLTESTCASES_RESOURCE_PATH, ".xml", filter, skip);
}