@java.lang.Override
public void run() {
    try {
        java.util.Set<de.gaalop.gui.OutputFile> output;
        output = facade.compile(sourcePanel.getInputFile());
        displayOutput(output);
    } catch (de.gaalop.gui.CompilationException ex) {
        log.error("Compilation exception", ex);
        statusBar.displayError();
        ex.printStackTrace();
        de.gaalop.gui.ErrorDialog.show(ex);
    }
}