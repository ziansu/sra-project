@org.testng.annotations.Test(priority = 1)
public void validateloggedUser() {
    home = login.LoginFunction("Luke", "Skywalker");
    org.testng.Assert.assertTrue(home.verifyHomePage(), "User id is correct");
}