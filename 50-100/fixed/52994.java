@com.tcs.kernel.security.test.Test
public void testDeleteUser() {
    java.lang.String usernameToSearch = "User-3";
    com.tcs.kernel.security.entity.User user = com.tcs.kernel.security.test.SecurityServiceTest.securityService.findUserByUsername(usernameToSearch);
    if (user == null) {
        fail((("Username '" + usernameToSearch) + "' does not exist for deletion"));
    }else {
        java.lang.Long userId = user.getUserId();
        com.tcs.kernel.security.test.SecurityServiceTest.securityService.deleteUser(user);
        com.tcs.kernel.security.entity.User user2 = com.tcs.kernel.security.test.SecurityServiceTest.securityService.findUserById(userId);
        assertThat(user2, is(nullValue()));
    }
}