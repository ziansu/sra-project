public java.io.File showFileChooser(java.lang.String ext) {
    jfc.setFileSelectionMode(javax.swing.JFileChooser.FILES_ONLY);
    jfc.setDialogTitle("�������� ����");
    javax.swing.filechooser.FileNameExtensionFilter ff = new javax.swing.filechooser.FileNameExtensionFilter(("." + ext), ext);
    jfc.addChoosableFileFilter(ff);
    jfc.setFileFilter(ff);
    int ret = jfc.showDialog(frame, "�������");
    if (ret == (javax.swing.JFileChooser.APPROVE_OPTION)) {
        return jfc.getSelectedFile();
    }
    return null;
}