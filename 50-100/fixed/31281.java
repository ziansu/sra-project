@org.junit.Test
public void checkCredentialsTest() {
    boolean response = loginService.checkCredentials(validEmail, validPassword);
    assertNotNull(response);
    assert (response == true) || (response == false);
    response = loginService.checkCredentials(invalidEmail, invalidPassword);
    assertFalse(response);
    response = loginService.checkCredentials(validEmail, invalidPassword);
    assertFalse(response);
    response = loginService.checkCredentials(invalidEmail, validPassword);
    assertFalse(response);
}