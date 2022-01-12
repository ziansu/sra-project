@java.lang.Override
public void execute(wl.domain.ExecutionContext context) {
    context.waitUntil((org.openqa.selenium.WebDriver driver) -> driver.getTitle().contains(expectedTitle));
    org.junit.Assert.assertThat(getDescription(), context.getDriver().getTitle(), org.hamcrest.core.StringContains.containsString(expectedTitle));
}