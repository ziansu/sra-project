public void setStartTime() {
    if ((this.testResult) == null) {
        this.testResult = new atr.connect.dto.TestResult();
        this.status = true;
    }
    this.testResult.setStart(new java.util.Date());
}