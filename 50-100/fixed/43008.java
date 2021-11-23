public void actionPerformed(java.awt.event.ActionEvent e) {
    if (e.getActionCommand().equals("ApproveSelection")) {
        path = fileBrowser.getSelectedFile();
        files = path.listFiles();
        directorySelected = true;
        assembleLeftPanelTextArea();
        readFile(files[counter]);
    }
}