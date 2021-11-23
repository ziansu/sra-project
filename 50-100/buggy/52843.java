public void actionPerformed(java.awt.event.ActionEvent e) {
    java.lang.String s = getSelectedItem(false);
    if (s != null) {
        java.io.File prev = getPreviousFile(file_map.get(s).getName());
        if (prev != null)
            new PrintPage("Report", file_map.get(s).getAbsolutePath(), prev.getAbsolutePath());
        
    }
}