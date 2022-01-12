@org.junit.Test
public void whenResetForgottenPassword_returnsOK() throws java.lang.Exception {
    com.e451.rest.domains.user.ResetForgottenPasswordRequest request = new com.e451.rest.domains.user.ResetForgottenPasswordRequest("first", "last", "username", "guid");
    org.mockito.Mockito.doNothing().when(userService).resetForgottenPassword(request);
    org.springframework.http.ResponseEntity response = usersController.resetForgottenPassword(request);
    org.junit.Assert.assertEquals(HttpStatus.OK, response.getStatusCode());
}