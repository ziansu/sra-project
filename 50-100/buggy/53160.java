@java.lang.Override
public void init() {
    DwenguinoBlocklyArduinoPlugin.startTimestamp = java.lang.System.currentTimeMillis();
    fxContainer = new javafx.embed.swing.JFXPanel();
    fxContainer.setPreferredSize(new java.awt.Dimension(JFXPANEL_WIDTH_INT, JFXPANEL_HEIGHT_INT));
    add(fxContainer, java.awt.BorderLayout.CENTER);
    java.lang.Runnable activeRunnable = new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            createScene();
        }
    };
    javafx.application.Platform.setImplicitExit(false);
    javafx.application.Platform.runLater(activeRunnable);
}