@cucumber.api.java.en.Then(value = "^I should be told the bet was successfully placed$")
public void i_should_be_told_the_bet_was_successfully_placed() {
    org.junit.Assert.assertEquals("Bet Successful!", bet_form.findByClass("message").get(0).getText());
    browser.findElement(org.openqa.selenium.By.className("sub")).click();
}