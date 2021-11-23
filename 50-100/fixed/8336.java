@org.junit.Test
public void selectWeek_verifyWeekAndHymnListingsAppear() {
    playHymnsPage.clickOnDropdown();
    org.openqa.selenium.support.ui.WebDriverWait waitForWeek = new org.openqa.selenium.support.ui.WebDriverWait(driver, 1);
    org.openqa.selenium.WebElement week = waitForWeek.until(org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable(org.openqa.selenium.By.className("week")));
    week.click();
}