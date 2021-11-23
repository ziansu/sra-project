@org.junit.Test
public void testGuiComponents() {
    controller.GameController controller = new controller.GameController();
    models.GameModel model = new models.GameModel();
    org.junit.Assert.assertNotNull(controller);
    org.junit.Assert.assertNotNull(model);
    view.View testView = new view.View(controller, model);
    view.AboutWindow aw = new view.AboutWindow();
    org.junit.Assert.assertNotNull(aw);
}