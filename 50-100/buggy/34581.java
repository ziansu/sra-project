@java.lang.Override
public void start(javafx.stage.Stage primaryStage) throws java.lang.Exception {
    new org.kframework.mpfr.BigFloat("1", org.kframework.mpfr.BinaryMathContext.BINARY64);
    javafx.scene.Parent root = javafx.fxml.FXMLLoader.load(getClass().getResource("main-window.fxml"));
    primaryStage.getIcons().add(new javafx.scene.image.Image("./stack-overflow.png"));
    primaryStage.setTitle("Bisection Method");
    primaryStage.setScene(new javafx.scene.Scene(root));
    primaryStage.setResizable(false);
    primaryStage.show();
}