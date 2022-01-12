@java.lang.Override
public void run() {
    boolean success = scan.convert(overlayTextField.getText(), statusArea, path, clipStart, clipEnd, minSizeBytes, maxSizeBytes, halveFramerate);
    thebombzen.tumblgififier.gui.MainFrame.getMainFrame().setBusy(false);
    if (success) {
        statusArea.appendStatus("Done!");
    }else {
        statusArea.appendStatus("Some error occured :(");
    }
}