public static void main(final java.lang.String[] args) {
    try {
        javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getCrossPlatformLookAndFeelClassName());
    } catch (java.lang.Exception e) {
        de.aikiit.fotorenamer.ApplicationStarter.LOG.error(("Error during application startup: " + e));
    }
    new de.aikiit.fotorenamer.gui.MainUIWindow();
}