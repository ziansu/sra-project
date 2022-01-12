public void testInput() {
    mySolo.enterText(1, "meinname");
    mySolo.enterText(0, "password");
    mySolo.enterText(0, "123");
    mySolo.clickOnButton("Sign in");
    boolean actual = mySolo.searchText("meinname");
    assertEquals("Fail", true, actual);
}