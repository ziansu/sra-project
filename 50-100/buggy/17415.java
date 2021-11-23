public static void test() {
    java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
    MacFrameSettings.width = ((int) (screenSize.getWidth()));
    MacFrameSettings.height = ((int) (screenSize.getHeight()));
    java.lang.System.out.println(("height = " + (MacFrameSettings.height)));
    java.lang.System.out.println(("width = " + (MacFrameSettings.width)));
}