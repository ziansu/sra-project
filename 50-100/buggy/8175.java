@java.lang.Override
public void run() {
    if ((Main.currentLevel) != (-1)) {
        javafx.application.Platform.runLater(new java.lang.Runnable() {
            @java.lang.Override
            public void run() {
                application.EnvironmentGUIPane pane = new application.EnvironmentGUIPane();
                pane.startLevel(Main.currentLevel);
                Main.scene.setRoot(pane);
            }
        });
        java.lang.System.out.println("pane.startLevel");
        application.MainMenu.mainMenuTimer.cancel();
    }
}