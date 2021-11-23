@cucumber.api.java.en.Then(value = "^I should see \"([^\"]*)\"$")
public org.openqa.selenium.WebElement I_should_see(java.lang.String contactNumber) {
    java.util.List<org.openqa.selenium.WebElement> headerLinks = driver.findElements(org.openqa.selenium.By.cssSelector("#trustedElements>li"));
    org.openqa.selenium.WebElement link = headerLinks.get(2);
    org.junit.Assert.assertTrue("The contact number is wrong", link.getText().equals(contactNumber));
    return link;
}