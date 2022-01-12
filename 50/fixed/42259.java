@java.lang.Override
public void closeWindow() {
    guiBuilder.getMailPanel().closePanel();
    if (askSaveForAllDirtyDiagrams()) {
        main.closeProgram();
        java.lang.System.exit(0);
    }
}