@java.lang.Override
public void start(javafx.stage.Stage primaryStage) throws java.lang.Exception {
    setPrimaryStage(primaryStage);
    password = new java.io.File("password.wver");
    if (password.exists()) {
        passwordForm = new com.core.objects.frames.PasswordFrame().getFrame();
    }else {
        passwordForm = new com.core.objects.frames.NewPasswordFrame().getFrame();
    }
    primaryStage.setTitle("Contact Book");
    primaryStage.setScene(new javafx.scene.Scene(passwordForm, 300, 275));
    primaryStage.show();
}