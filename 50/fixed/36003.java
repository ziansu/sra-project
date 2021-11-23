public java.lang.String getProblemPropose() {
    return driver.findElements(com.saucelabs.pages.ProblemPage.PROBLEM_PROPOSE).get(0).getAttribute("textContent");
}