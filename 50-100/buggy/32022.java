@java.lang.Override
public void start(javafx.stage.Stage stage) throws java.lang.Exception {
    javafx.scene.Scene scene = sceneConstructor.makeScene();
    if (scene == null) {
        return ;
    }
    stage.setOnCloseRequest(( event) -> uk.dangrew.jupa.javafx.platform.PlatformLifecycle.shutdown());
    stage.setScene(scene);
    stage.setMaximized(true);
    stage.show();
}