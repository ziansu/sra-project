public void run() {
    try {
        javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());
    } catch (java.lang.Exception ex) {
    }
    com.thedeanda.ajaxproxy.ui.MainFrame frame = new com.thedeanda.ajaxproxy.ui.MainFrame();
    frame.setLocationByPlatform(true);
    frame.setVisible(true);
    if (!(org.apache.commons.lang3.StringUtils.isBlank(config))) {
        java.io.File file = new java.io.File(config);
        frame.loadFile(file);
    }
    if (runui) {
        frame.startProxy();
    }
    frame.addVariables(vars);
}