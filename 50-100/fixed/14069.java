public void testGetAccounts() {
    assertNotNull(nullUser.getUserAccounts());
    java.util.ArrayList<edu.csudh.goTorosBank.Account> testAccounts = new java.util.ArrayList<edu.csudh.goTorosBank.Account>();
    edu.csudh.goTorosBank.Account testAccount = new edu.csudh.goTorosBank.Account(1, 1000, genericUser, null);
    testAccounts.add(testAccount);
    assertEquals(1, genericUser.getUserAccounts().size());
}