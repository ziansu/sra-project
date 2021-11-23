@org.junit.Test
@com.hp.autonomy.frontend.selenium.framework.logging.ResolvedBug(value = "CSA-1665")
public void testSearchTermInResults() {
    final java.lang.String searchTerm = "tiger";
    final com.autonomy.abc.selenium.find.results.ListView results = findService.search(searchTerm);
    for (final org.openqa.selenium.WebElement searchElement : results.resultsContainingString(searchTerm)) {
        if (searchElement.isDisplayed()) {
            verifyThat(searchElement.getText().toLowerCase(), com.hp.autonomy.frontend.selenium.matchers.StringMatchers.containsString(searchTerm));
        }
        verifyThat(searchElement, not(com.hp.autonomy.frontend.selenium.matchers.ElementMatchers.hasTagName("a")));
    }
}