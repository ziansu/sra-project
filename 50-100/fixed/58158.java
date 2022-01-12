@org.testng.annotations.Test
public void fetchApexClassesFromManifestFilesTest() {
    java.lang.String[] testClasses = com.sforce.cd.apexUnit.client.utils.ApexClassFetcherUtils.fetchApexClassesFromManifestFiles(com.sforce.cd.apexUnit.arguments.CommandLineArguments.getTestManifestFiles(), true);
    if (((testClasses != null) && ((com.sforce.cd.apexUnit.client.utils.ApexClassFetcherUtils.apexClassMap) != null)) && ((ApexClassFetcherUtils.apexClassMap.size()) != (testClasses.length))) {
        junit.framework.Assert.assertTrue((((testClasses.length) > 0) || ((ApexClassFetcherUtils.apexClassMap.size()) > 0)));
    }
}