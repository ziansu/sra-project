@java.lang.Override
public void start(javafx.stage.Stage primaryStage) {
    try {
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("AVTF Equipment Manager");
        initRootLayout();
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}