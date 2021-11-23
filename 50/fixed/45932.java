@java.lang.Override
public void run() {
    logger.debug("popUpFileChooser invoked");
    int result = jFileChooser.showOpenDialog(new java.awt.Panel());
    if (result == (javax.swing.JFileChooser.APPROVE_OPTION)) {
        getFileList(jFileChooser);
    }
}