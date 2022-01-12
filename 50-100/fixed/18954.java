private void showAddFiles() {
    jfc.setFileSelectionMode(javax.swing.JFileChooser.FILES_AND_DIRECTORIES);
    jfc.setMultiSelectionEnabled(true);
    jfc.setDialogTitle("�������� ����� � �����, ������� ������ �����������");
    int ret = jfc.showDialog(frame, "�������");
    if (ret == (javax.swing.JFileChooser.APPROVE_OPTION)) {
        explorerPanel.importFiles(jfc.getSelectedFiles());
    }
}