@org.apache.felix.dm.annotation.api.Start
void start() {
    java.lang.System.out.println(new javafx.embed.swing.JFXPanel());
    javafx.application.Platform.setImplicitExit(false);
    java.lang.System.out.println("Dashboard started");
    javafx.application.Platform.runLater(() -> createUI());
}