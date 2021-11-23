public void setTestInfo(java.lang.String runInfo) {
    if ((this.testResult) == null) {
        this.testResult = new atr.connect.dto.TestResult();
    }
    this.testResult.setRunInfo(runInfo);
}