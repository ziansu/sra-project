private void disableSelection() {
    isSelect = false;
    for (javax.swing.JLabel l : selectedFiles.keySet())
        l.setEnabled(true);
    
    selectedFiles.clear();
}