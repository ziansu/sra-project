@java.lang.Override
public void start(javafx.stage.Stage stage) {
    this.eventBus = new com.google.common.eventbus.EventBus("Test Event Bus");
    this.mockCameraSourceFactory = new edu.wpi.grip.ui.pipeline.AddSourceViewTest.AddSourceViewNoExceptionsTest.MockCameraSourceFactory(eventBus);
    addSourceView = new edu.wpi.grip.ui.pipeline.AddSourceView(eventBus, null, null, mockCameraSourceFactory, null);
    final javafx.scene.Scene scene = new javafx.scene.Scene(addSourceView, 800, 600);
    stage.setScene(scene);
    stage.show();
}