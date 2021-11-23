@java.lang.Override
public void mousePressed(java.awt.event.MouseEvent arg0) {
    if (prepareSelectedFiles())
        cryptSelectedFiles(preparedFiles, true, false);
    
}