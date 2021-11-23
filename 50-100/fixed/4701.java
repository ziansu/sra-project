@java.lang.Override
public void start(javafx.stage.Stage stage) throws java.lang.Exception {
    buffer = new us.ihmc.yoVariables.dataBuffer.DataBuffer(us.ihmc.robotDataVisualizer.graphics.YoGraphicServerVisualizer.BUFFER_SIZE);
    stage.setScene(new javafx.scene.Scene((display = new us.ihmc.robotDataVisualizer.graphics.LiveMeshDisplay((yoGraphicMeshProvider = new us.ihmc.robotDataVisualizer.graphics.meshProvider.AsyncMeshProvider())))));
    stage.show();
    yoVariableClient = new us.ihmc.robotDataLogger.YoVariableClient(this);
    yoVariableClient.start();
}