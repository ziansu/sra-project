@org.junit.Test
public void cannotLoginWithUserNameThatDoesNotExist() {
    java.lang.String username = UsersTestHelper.NOSUCHUSER;
    java.lang.String password = UsersTestHelper.DOESNTMATTER;
    assertEquals(false, users.login(username, password));
}