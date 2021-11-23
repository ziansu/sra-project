@java.lang.Override
public void afterTestClass(org.springframework.test.context.TestContext testContext) throws java.lang.Exception {
    for (org.springframework.test.context.TestExecutionListener listener : com.payu.ratel.tests.RatelIntegrationTestExecutionListener.listeners) {
        listener.afterTestClass(testContext);
    }
}