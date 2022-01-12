@java.lang.Override
public void handle(javafx.event.ActionEvent event) {
    updateLocDataRow();
    initExporter();
    if ("run".equals(runButton.getText().toLowerCase(java.util.Locale.US))) {
        exporter.start();
        runButton.setText("stop");
    }else {
        exporter.stop();
        exporter = null;
        runButton.setText("run");
    }
}