@java.lang.Override
public void handle(javafx.concurrent.WorkerStateEvent workerStateEvent) {
    root.getChildren().addAll(cam.filterVisible(net));
    p.destructor();
    stage.setScene(mapScene);
}