public void prepareRun() {
    internalCloseRunner();
    statusEmpty();
    for (int i = 0; i < 10; i++)
        java.lang.System.out.println();
    
    if (processing.app.Preferences.getBoolean("console.auto_clear")) {
        console.clear();
    }
    sketch.ensureExistence();
    for (processing.app.SketchCode sc : sketch.getCode()) {
        try {
            sc.setProgram(sc.getDocumentText());
        } catch (javax.swing.text.BadLocationException e) {
        }
    }
}