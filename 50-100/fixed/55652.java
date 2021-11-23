@org.junit.Test
public void whenResetForgottenPassword_userServiceThrowsException_returnsInternalServerError() throws java.lang.Exception {
    com.e451.rest.domains.user.ResetForgottenPasswordRequest request = new com.e451.rest.domains.user.ResetForgottenPasswordRequest("username", "guid");
    org.mockito.Mockito.doThrow(new org.springframework.dao.RecoverableDataAccessException("error")).when(userService).resetForgottenPassword(request);
    org.springframework.http.ResponseEntity response = usersController.resetForgottenPassword(request);
    org.junit.Assert.assertEquals(HttpStatus.INTERNAL_SERVER_ERROR, response.getStatusCode());
}