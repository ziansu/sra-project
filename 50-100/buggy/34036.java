private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
    java.lang.Process p;
    try {
        if (java.lang.System.getProperty("os.name").contains("Windows")) {
            p = java.lang.Runtime.getRuntime().exec(((WzFiles.wzapath) + " --host"));
        }else {
            p = java.lang.Runtime.getRuntime().exec(((WzFiles.wzapath) + " --host"));
        }
    } catch (java.io.IOException ex) {
        java.util.logging.Logger.getLogger(wzL.NJFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
}