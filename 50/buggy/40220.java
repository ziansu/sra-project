@org.junit.jupiter.api.Test
void loginFailure() {
    java.lang.String exampleUsenname = "exUsername";
    java.lang.String examplePassword = "exPassword";
    server.rest.controllers.UserController controller = new server.rest.controllers.UserController();
    server.rest.responses.LoginResponse response = controller.login(exampleUsenname, examplePassword);
    assertEquals(response.getErrorMessage(), server.rest.controllers.UserControllerTest.LOGIN_INCORRECT_RESPONSE);
}