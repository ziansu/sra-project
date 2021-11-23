private boolean requiresErrorChecking(java.lang.Throwable t) {
    if (!(t instanceof org.aludratest.exception.AludraTestException)) {
        return false;
    }
    org.aludratest.testcase.TestStatus status = org.aludratest.testcase.event.impl.AludraTestUtil.getTestStatus(t);
    return (status == (org.aludratest.testcase.TestStatus.FAILED)) || (status == (org.aludratest.testcase.TestStatus.FAILEDAUTOMATION));
}