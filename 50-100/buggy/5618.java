public java.lang.String toString() {
    return ((((("" + "\nfailing: ") + (printTestResult(this.getTestResult()))) + "\nmanual_regression: ") + (printTestResult(this.manualTestValidation.getTestResult()))) + "\nevo_regression: ") + (printTestResult(this.evoValidation.getTestResult()));
}