public void searchMail(java.lang.String subject) {
    getWebDriver().findElement(org.openqa.selenium.By.name("q")).sendKeys((subject + (org.openqa.selenium.Keys.ENTER)));
}