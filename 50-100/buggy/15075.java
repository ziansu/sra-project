@org.junit.Test
public void changePassword() {
    logInUser();
    javax.ws.rs.core.Response response = no.ntnu.stud.minvakt.services.UserAdminServiceTest.userService.changePassword("password", "password");
    org.junit.Assert.assertTrue(((response.getStatus()) == 200));
    response = no.ntnu.stud.minvakt.services.UserAdminServiceTest.userService.changePassword("passwor", "password");
    org.junit.Assert.assertTrue(((response.getStatus()) == 304));
}