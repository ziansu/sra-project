@java.lang.Override
public void run() {
    boolean success = scan.convert(overlayTextField.getText(), statusArea, path, clipStart, clipEnd, minSizeBytes, maxSizeBytes, halveFramerate);
    thebombzen.tumblgififier.gui.MainFrame.getMainFrame().setBusy(false);
    if (success) {
        statusArea.appendStatus("Done!");
        javax.swing.JOptionPane.showMessageDialog(this, "Done!", "Success!", javax.swing.JOptionPane.INFORMATION_MESSAGE);
    }else {
        statusArea.appendStatus("Some error occured :(");
        javax.swing.JOptionPane.showMessageDialog(this, "Some error occured :(", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
    }
}