@org.testng.annotations.Test
public void method2(java.lang.reflect.Method method) {
    com.relevantcodes.extentreports.common.ExtentTestManager.createTest(method.getName()).fail("fail");
    org.testng.Assert.assertEquals(com.relevantcodes.extentreports.common.ExtentTestManager.getTest().getRunStatus(), Status.FAIL);
}