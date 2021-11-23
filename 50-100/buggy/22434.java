private void save() throws java.io.IOException {
    if (((GUI.MainUI.result) != null) || ((GUI.MainUI.result.length) == 0)) {
        updateVar();
        file.writeFile(GUI.MainUI.result);
        javax.swing.JOptionPane.showMessageDialog(null, "Data telah disimpan!");
    }
}