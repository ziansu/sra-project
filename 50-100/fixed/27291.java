public void run() {
    try {
        com.ardublock.ArduBlockTool.editor.toFront();
        com.ardublock.ArduBlockTool.openblocksFrame.setVisible(true);
        com.ardublock.ArduBlockTool.openblocksFrame.toFront();
        if (firstRun) {
            com.ardublock.core.MessageFetcher mf = new com.ardublock.core.MessageFetcher();
            mf.startFetchMessage(new com.ardublock.ui.MessageDialog(com.ardublock.ArduBlockTool.openblocksFrame), context);
            firstRun = false;
        }
        editorChanged();
    } catch (java.lang.Exception e) {
    }
}