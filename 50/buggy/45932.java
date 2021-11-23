@java.lang.Override
public void run() {
    int result = jFileChooser.showOpenDialog(new java.awt.Panel());
    if (result == (javax.swing.JFileChooser.APPROVE_OPTION)) {
        getFileList(jFileChooser);
    }
    logger.debug("popUpFileChooser invoked");
}