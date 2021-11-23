@java.lang.Override
public void handle(javafx.stage.WindowEvent t) {
    try {
        com.selfie.app.HC05.close();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
    javafx.application.Platform.exit();
    java.lang.System.exit(0);
}