public static void endR() {
    org.deidentifier.arx.gui.RTerminal.r.shutdown();
    org.deidentifier.arx.gui.RTerminal.showEndDialog();
    org.deidentifier.arx.gui.RTerminal.tabTerminal.disableTab();
}