@java.lang.Override
public void closeWindow() {
    guiBuilder.getMailPanel().closePanel();
    if (askSaveForAllDirtyDiagrams()) {
        main.closeProgram();
        mainFrame.dispose();
    }
}