@org.junit.Test(expected = org.springframework.security.authentication.BadCredentialsException.class)
public void whenUserResetsForgottenPasswordExpired_verifyBadCredentialsExceptionThrown() throws java.lang.Exception {
    com.e451.rest.domains.user.User user = users.get(0);
    user.setResetPasswordGuid("1234");
    user.setResetPasswordSentDate(new java.util.Date(0L));
    org.mockito.Mockito.when(userRepository.findByResetPasswordGuid("1234")).thenReturn(user);
    com.e451.rest.domains.user.ResetForgottenPasswordRequest request = new com.e451.rest.domains.user.ResetForgottenPasswordRequest(user.getUsername(), user.getResetPasswordGuid());
    request.setNewPassword("Password1!");
    userService.resetForgottenPassword(request);
}