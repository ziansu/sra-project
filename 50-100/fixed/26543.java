@org.junit.Test
@com.hp.autonomy.frontend.selenium.framework.logging.ResolvedBug(value = "CCUK-3647")
public void testNoMoreResultsFoundAtEnd() {
    final com.autonomy.abc.selenium.find.results.ListView results = findService.search(new com.autonomy.abc.selenium.query.Query("Cheese AND Onion AND Carrot"));
    results.waitForResultsToLoad();
    verifyThat(results.getTotalResultsNum(), lessThanOrEqualTo(30));
    findPage.scrollToBottom();
    verifyThat(results.resultsDiv(), com.hp.autonomy.frontend.selenium.matchers.ElementMatchers.containsText("No more results found"));
}