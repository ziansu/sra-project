@org.junit.Test
@com.hp.autonomy.frontend.selenium.framework.logging.ResolvedBug(value = "FIND-350")
@com.autonomy.abc.base.Role(value = com.autonomy.abc.selenium.find.application.UserRole.FIND)
public void testDecliningAutoCorrectNotPermanent() {
    search("blarf");
    findPage.originalQuery().click();
    findPage.waitForParametricValuesToLoad();
    search("eevrywhere");
    verifyThat("Says it corrected query", findPage.originalQuery(), org.openqa.selenium.lift.Matchers.displayed());
    final com.autonomy.abc.selenium.find.results.ListView results = findPage.goToListView();
    verifyThat("There are results in list view", results.getTotalResultsNum(), greaterThan(0));
}