public static void endR() {
    if ((org.deidentifier.arx.gui.RTerminal.r) != null) {
        org.deidentifier.arx.gui.RTerminal.r.shutdown();
        org.deidentifier.arx.gui.RTerminal.showEndDialog();
    }
    org.deidentifier.arx.gui.RTerminal.tabTerminal.disableTab();
}