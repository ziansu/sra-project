@org.testng.annotations.Test
public void fetchApexClassesBasedOnPrefixTest() {
    java.lang.String[] testClasses = com.sforce.cd.apexUnit.client.utils.ApexClassFetcherUtils.fetchApexClassesBasedOnMultipleRegexes(conn, null, com.sforce.cd.apexUnit.arguments.CommandLineArguments.getTestRegex());
    if (testClasses != null) {
        junit.framework.Assert.assertTrue((((testClasses.length) > 0) || ((ApexClassFetcherUtils.apexClassMap.size()) > 0)));
    }
}