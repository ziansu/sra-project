@org.junit.Test
public void testCreateAccount() {
    java.lang.String pass2 = "lel";
    userObj2 = model.createAccount(user2, pass2, AccountType.Manager);
    assertEquals(userObj2, model.getUsers().get(user2));
}