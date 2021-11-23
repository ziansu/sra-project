public boolean folderSelectorON() {
    chooser.setFileSelectionMode(javax.swing.JFileChooser.DIRECTORIES_ONLY);
    chooser.showOpenDialog(chooser);
    java.io.File dir = chooser.getSelectedFile();
    try {
        selectedPath = dir.getPath();
        selectionEnd = true;
        return true;
    } catch (java.lang.NullPointerException e) {
        java.lang.System.out.println("������ ���õ��� �ʾҽ��ϴ�.");
        return false;
    }
}