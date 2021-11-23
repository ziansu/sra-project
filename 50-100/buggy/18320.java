@java.lang.Override
public void handle(java.lang.String line) {
    if (running) {
        org.hildan.fxlog.core.LogEntry log = columnizer.parse(line);
        javafx.application.Platform.runLater(() -> {
            if (running) {
                logs.add(log);
            }
        });
    }
}