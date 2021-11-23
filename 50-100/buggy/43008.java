public void actionPerformed(java.awt.event.ActionEvent e) {
    if (e.getActionCommand().equals("ApproveSelection")) {
        path = fileBrowser.getSelectedFile();
        files = path.listFiles();
        directorySelected = true;
        boolean readFileSuccess = readFile(files[counter]);
        if (readFileSuccess)
            assembleLeftPanelTextArea();
        
    }
}