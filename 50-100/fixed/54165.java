public void actionPerformed(java.awt.event.ActionEvent e) {
    int opt = javax.swing.JOptionPane.showConfirmDialog(null, "Selected set of symbols will be deleted", "Delete symbols", javax.swing.JOptionPane.OK_CANCEL_OPTION);
    if (opt == (javax.swing.JOptionPane.OK_OPTION)) {
        java.awt.Component cmp = symbolsTabPane.getSelectedComponent();
        java.lang.String key = (cmp == null) ? null : cmp.getName();
        if (key != null) {
            symbolsTabPane.remove(cmp);
            symbolMap.remove(key);
            updateSymbolPrefs();
        }
    }
}