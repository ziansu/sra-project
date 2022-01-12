@java.lang.Override
public void start(javafx.stage.Stage primaryStage) {
    looksBKSTR();
    cB.getSelectionModel().selectedItemProperty().addListener(( v, oldValue, newValue) -> {
        cbl.listener(cB, tA, bP);
    });
    primaryStage.getIcons().add(new javafx.scene.image.Image("itemsReq/utrgv.png"));
    primaryStage.setTitle("Important Information");
    primaryStage.setMaximized(true);
    primaryStage.setScene(scene);
    primaryStage.show();
}