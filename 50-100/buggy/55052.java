@org.junit.Test
public void login() throws java.lang.Exception {
    com.tigersale.model.CustomerUser customerUser = com.tigersale.database.CustomerUserTable.login(com.test.database.CustomerUserTableTest.CUSTOMER_USER_NAME, com.test.database.CustomerUserTableTest.PASSWORD);
    assertSame(com.test.database.CustomerUserTableTest.CUSTOMER_USER_NAME, customerUser.customerUsername);
    assertSame(com.test.database.CustomerUserTableTest.PASSWORD, customerUser.password);
    assertSame(com.test.database.CustomerUserTableTest.DATE_OF_BIRTH, customerUser.dateOfBirth);
    assertSame(com.test.database.CustomerUserTableTest.FIRST_NAME, customerUser.firstName);
    assertSame(com.test.database.CustomerUserTableTest.LAST_NAME, customerUser.lastName);
    assertSame(com.test.database.CustomerUserTableTest.MIDDLE_INITIAL, customerUser.middleInitial);
}