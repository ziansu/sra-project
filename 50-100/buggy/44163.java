@org.junit.Test
public void whenResetForgottenPassword_userServiceThrowsInvalidException_returnsUnauthorized() throws java.lang.Exception {
    com.e451.rest.domains.user.ResetForgottenPasswordRequest request = new com.e451.rest.domains.user.ResetForgottenPasswordRequest("first", "last", "username", "guid");
    org.mockito.Mockito.doThrow(new com.e451.rest.domains.InvalidPasswordException()).when(userService).resetForgottenPassword(request);
    org.springframework.http.ResponseEntity response = usersController.resetForgottenPassword(request);
    org.junit.Assert.assertEquals(HttpStatus.UNAUTHORIZED, response.getStatusCode());
}