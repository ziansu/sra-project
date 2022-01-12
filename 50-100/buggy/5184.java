public static void main(java.lang.String[] args) {
    try {
        javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());
    } catch (java.lang.Exception e) {
        java.lang.System.err.println(e.getMessage());
    }
    com.jidesoft.app.framework.gui.filebased.FileBasedApplication app = new com.wwidesigner.gui.WIDesigner();
    app.getApplicationUIManager().setSetsLookAndFeel(false);
    com.jidesoft.utils.Lm.verifyLicense("Edward Kort", "WWIDesigner", "DfuwPRAUR5KQYgePf:CH0LWIp63V8cs2");
    app.run(args);
}