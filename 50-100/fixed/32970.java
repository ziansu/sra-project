public static void main(java.lang.String[] args) {
    try {
        javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());
        javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getCrossPlatformLookAndFeelClassName());
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    FrameViewer mainFrame = new FrameViewer();
    mainFrame.setVisible(true);
}