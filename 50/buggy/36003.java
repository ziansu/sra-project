public java.lang.String getProblemPropose() {
    return driver.findElements(com.saucelabs.pages.ProblemPage.PROBLEM_PROPOSE).get(1).getAttribute("textContent");
}