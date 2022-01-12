@org.jvnet.hudson.test.recipes.LocalData
@org.junit.Test
public void verifyTestNG() throws java.lang.InterruptedException, java.util.concurrent.ExecutionException {
    java.lang.String query = "ExampleIntegrationTest| spath | search \"testsuite.testcase{}.classname\"=ExampleIntegrationTest";
    hudson.model.FreeStyleProject project = ((hudson.model.FreeStyleProject) (j.getInstance().getItem("testng_job1")));
    long startTime = java.lang.System.currentTimeMillis();
    hudson.model.AbstractBuild build = project.scheduleBuild2(0).get();
    com.splunk.splunkjenkins.SplunkConfigUtil.verifySplunkSearchResult(query, startTime, 1);
}