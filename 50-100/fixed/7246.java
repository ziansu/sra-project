@org.junit.Test
@com.hp.autonomy.frontend.selenium.framework.logging.ResolvedBug(value = "FIND-93")
public void testNoResults() {
    final com.autonomy.abc.selenium.find.results.ListView results = findService.search("thissearchwillalmostcertainlyreturnnoresults");
    new org.openqa.selenium.support.ui.WebDriverWait(getDriver(), 60L).withMessage("No results message should appear").until(org.openqa.selenium.support.ui.ExpectedConditions.textToBePresentInElement(results.resultsDiv(), "No results found"));
    findPage.scrollToBottom();
    final int occurrences = org.apache.commons.lang3.StringUtils.countMatches(results.resultsDiv().getText(), "results found");
    verifyThat("Only one message showing at the bottom of search results", occurrences, org.hamcrest.core.Is.is(1));
}