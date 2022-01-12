@org.junit.Test(expected = com.e451.rest.domains.InvalidPasswordException.class)
public void whenUserResetsPasswordPasswordInvalid_verifyInvalidPasswordException() throws java.lang.Exception {
    com.e451.rest.domains.user.User user = users.get(0);
    user.setResetPasswordGuid("1234");
    user.setResetPasswordSentDate(new java.util.Date());
    org.mockito.Mockito.when(userRepository.findByResetPasswordGuid("1234")).thenReturn(user);
    com.e451.rest.domains.user.ResetForgottenPasswordRequest request = new com.e451.rest.domains.user.ResetForgottenPasswordRequest(user.getFirstName(), user.getLastName(), user.getUsername(), user.getResetPasswordGuid());
    request.setNewPassword("password");
    userService.resetForgottenPassword(request);
}