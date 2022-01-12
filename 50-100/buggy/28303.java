public void setTestInfo(java.lang.String name, java.lang.String params, java.lang.String extra) {
    if ((this.testResult) == null) {
        this.testResult = new atr.connect.dto.TestResult(name, params, extra);
    }else {
        this.testResult.setName(name);
        this.testResult.setParam(params);
        this.testResult.setExtra(extra);
    }
}