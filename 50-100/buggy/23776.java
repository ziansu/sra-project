@java.lang.Override
public void execute(wl.domain.ExecutionContext context) {
    context.waitUntil((org.openqa.selenium.WebDriver driver) -> expectedTitle.contains(driver.getTitle()));
    org.junit.Assert.assertThat(getDescription(), context.getDriver().getTitle(), org.hamcrest.core.StringContains.containsString(expectedTitle));
}