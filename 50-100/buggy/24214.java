@java.lang.Override
public void execute(wl.domain.ExecutionContext context) {
    context.waitUntil((org.openqa.selenium.WebDriver driver) -> expectedTitle.equals(driver.getTitle()));
    java.lang.String title = context.getDriver().getTitle();
    org.junit.Assert.assertEquals(getDescription(), expectedTitle, title);
}