public void goPage() throws org.lioxa.ustc.suckserver.routine.ExecutionException, org.lioxa.ustc.suckserver.routine.ParameterException {
    org.openqa.selenium.WebElement newElement = this.globalContext.getBrowserDriver().select("body", this.retry, this.delay).get(0);
    this.localContext.put("dom", newElement);
    this.executeSubRoutines();
}