@org.junit.Test(expected = net.slipp.UnAuthenticationException.class)
public void login_failed_when_user_not_found() throws java.lang.Exception {
    when(userRepository.findByUserId("sanjigi")).thenReturn(java.util.Optional.empty());
    userService.login("sanjigi", "password");
}