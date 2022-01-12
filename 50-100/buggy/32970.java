public static void main(java.lang.String[] args) {
    java.lang.System.setProperty("apple.laf.useScreenMenuBar", "true");
    java.lang.System.setProperty("com.apple.mrj.application.apple.menu.about.name", "WikiTeX");
    try {
        javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());
        javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getCrossPlatformLookAndFeelClassName());
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    FrameViewer mainFrame = new FrameViewer();
    mainFrame.setVisible(true);
}