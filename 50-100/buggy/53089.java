public void filterTable() {
    updateVar();
    updateTableAll();
    if (!(GUI.MainUI.empty)) {
        filterSkill();
        filterJK();
        if (!(search())) {
            javax.swing.JOptionPane.showMessageDialog(null, "Not found!");
            java.lang.System.out.println("search result not found!");
            updateTableAll();
        }else {
            updateTableAll();
        }
        showRow();
    }
}