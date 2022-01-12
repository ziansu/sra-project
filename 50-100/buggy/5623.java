public void checkInvalidField(org.openqa.selenium.WebElement field, java.lang.String value, org.openqa.selenium.By error) {
    driver.get(PagesURL.SIGN_UP_PAGE);
    fillField(field, value);
    btnRegister.click();
    org.openqa.selenium.WebElement errorElem = driver.findElement(error);
    org.junit.Assert.assertTrue((!(errorElem.getText().isEmpty())));
}