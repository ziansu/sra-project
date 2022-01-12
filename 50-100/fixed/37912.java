public void setTestInfo(java.lang.String name, java.lang.String runInfo, java.lang.String params, java.lang.String extra) {
    if ((this.testResult) == null) {
        this.testResult = new atr.connect.dto.TestResult(name, runInfo, params, extra);
        this.status = true;
    }else {
        this.testResult.setName(name);
        this.testResult.setRunInfo(runInfo);
        this.testResult.setParam(params);
        this.testResult.setExtra(extra);
    }
}