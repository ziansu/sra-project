public java.lang.String toString() {
    return ((("" + "\nfailing: ") + (printTestResult(this.getTestResult()))) + ((this.manualTestValidation) != null ? "\nmanual_regression: " + (printTestResult(this.manualTestValidation.getTestResult())) : "")) + ((this.evoValidation) != null ? "\nevo_regression: " + (printTestResult(this.evoValidation.getTestResult())) : "");
}