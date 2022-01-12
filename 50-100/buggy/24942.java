public void run() {
    try {
        java.lang.System.setProperty("awt.useSystemAAFontSettings", "on");
        java.lang.System.setProperty("swing.aatext", "true");
        javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());
        bing_wallpaper.Settings frame = new bing_wallpaper.Settings(null, new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR), "����");
        frame.setVisible(true);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}