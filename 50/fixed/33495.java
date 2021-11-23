private void setSelectedMode() {
    isSelect = !(isSelect);
    if (!(isSelect)) {
        for (javax.swing.JLabel l : selectedFiles.keySet())
            l.setEnabled(true);
        
        selectedFiles.clear();
    }
}