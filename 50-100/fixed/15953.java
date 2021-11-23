@org.testng.annotations.Test(groups = { "main" }, priority = 1)
public void signIn() throws java.lang.Exception {
    try {
        java.lang.System.out.println("signIn");
        org.openqa.selenium.WebElement element = new org.openqa.selenium.support.ui.WebDriverWait(driver, 60).until(org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated(org.openqa.selenium.By.id("tutorial_signin_button")));
        try {
            swipeThroughFrames();
            element.click();
        } catch (org.openqa.selenium.NoSuchElementException e) {
            element.click();
        }
    } catch (org.openqa.selenium.NotFoundException e) {
        java.lang.System.out.println("coudn't find sign in button");
    }
}