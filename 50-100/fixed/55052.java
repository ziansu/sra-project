@org.junit.Test
public void login() throws java.lang.Exception {
    com.tigersale.model.CustomerUser customerUser = com.tigersale.database.CustomerUserTable.login(com.test.database.CustomerUserTableTest.CUSTOMER_USER_NAME, com.test.database.CustomerUserTableTest.PASSWORD);
    assertEquals(com.test.database.CustomerUserTableTest.CUSTOMER_USER_NAME, customerUser.customerUsername);
    assertEquals(com.test.database.CustomerUserTableTest.PASSWORD, customerUser.password);
    assertEquals(com.test.database.CustomerUserTableTest.DATE_OF_BIRTH.toString(), customerUser.dateOfBirth.toString());
    assertEquals(com.test.database.CustomerUserTableTest.FIRST_NAME, customerUser.firstName);
    assertEquals(com.test.database.CustomerUserTableTest.LAST_NAME, customerUser.lastName);
    assertEquals(com.test.database.CustomerUserTableTest.MIDDLE_INITIAL, customerUser.middleInitial);
}