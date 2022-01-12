public void setTestInfo(java.lang.String name, java.lang.String params) {
    if ((this.testResult) == null) {
        this.testResult = new atr.connect.dto.TestResult(name, params);
    }else {
        this.testResult.setName(name);
        this.testResult.setParam(params);
    }
}