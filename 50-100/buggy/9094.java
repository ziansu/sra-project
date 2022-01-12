private boolean containsErrors(java.util.List<com.hp.application.automation.tools.sse.result.model.junit.Testsuite> testsuites) {
    boolean ret = false;
    for (com.hp.application.automation.tools.sse.result.model.junit.Testsuite testsuite : testsuites) {
        for (com.hp.application.automation.tools.sse.result.model.junit.Testcase testcase : testsuite.getTestcase()) {
            if (testcase.getStatus().equals("error")) {
                ret = true;
                break;
            }
        }
    }
    return ret;
}