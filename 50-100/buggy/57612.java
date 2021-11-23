private void doCertificate() {
    java.util.Map<java.lang.String, java.lang.String> args = buildAllMap();
    int ret = controller.generateCertificate(args);
    java.lang.String msg = "成功输出";
    if (ret != 0) {
        msg = controller.getLatestError();
    }
    javax.swing.JOptionPane.showMessageDialog(null, msg, "提示", javax.swing.JOptionPane.ERROR_MESSAGE);
}