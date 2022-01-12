@org.junit.Test
public void testCheckLogin() {
    application.controllers.PublicMenuController controller = new application.controllers.PublicMenuController();
    mock(controller);
    controller.setUsername(username);
    controller.setPassword(password);
    assertEquals(expected, controller.checkLogin());
}