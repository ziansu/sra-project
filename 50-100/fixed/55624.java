@cucumber.api.java.After
public void afterScenario(cucumber.api.Scenario scenario) {
    if (scenario.isFailed()) {
        final byte[] screenshot = ((org.openqa.selenium.TakesScreenshot) (pageStore.getDriver())).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot, "image/png");
    }
}