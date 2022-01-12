public static void test() {
    java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
    MacFrameSettings.width = ((int) (screenSize.getWidth()));
    MacFrameSettings.height = ((int) (screenSize.getHeight()));
}