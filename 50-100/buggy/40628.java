@java.lang.Override
public void start(javafx.stage.Stage stage) throws java.lang.ClassNotFoundException, java.lang.IllegalAccessException, java.lang.IllegalArgumentException, java.lang.InstantiationException, java.lang.NoSuchMethodException, java.lang.SecurityException, java.lang.reflect.InvocationTargetException {
    controller.ImageSetUp.initialize();
    javafx.scene.Group root = new javafx.scene.Group();
    javafx.scene.Scene scene = new javafx.scene.Scene(root);
    stage.setTitle(controller.Main.TITLE);
    stage.setResizable(false);
    stage.setHeight(controller.Main.SCREEN_HEIGHT);
    stage.setWidth(controller.Main.SCREEN_WIDTH);
    stage.setScene(scene);
    controller.Main.myController = new controller.Controller(stage);
    controller.Main.myController.launchGame();
}