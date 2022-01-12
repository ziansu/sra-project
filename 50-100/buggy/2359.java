private void onRunPressed() {
    if ((workPath) == null) {
        javax.swing.JOptionPane.showMessageDialog(this, workPathIsNullErrorMessage, "User Input Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        return ;
    }
    java.lang.String tmpFilePath = (workPath) + (runfile);
    java.lang.String fileToRun = runFileField.getText();
    java.lang.String outfile = (('"' + (workPath)) + (fileToRun.equals("") ? "runit" : fileToRun)) + '"';
    writeAndExecuteCommand(tmpFilePath, ((runCommand) + outfile), "");
}