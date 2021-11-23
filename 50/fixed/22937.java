public void setExtra(java.lang.String extra) {
    if ((this.testResult) == null) {
        this.testResult = new atr.connect.dto.TestResult();
        this.status = true;
    }
    this.testResult.setExtra(extra);
}