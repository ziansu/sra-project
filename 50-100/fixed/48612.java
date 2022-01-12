public void filterTable() {
    updateVar();
    updateTableAll();
    filterSkill();
    filterJK();
    if (!(search())) {
        javax.swing.JOptionPane.showMessageDialog(null, "Not found!");
        updateTableAll();
    }else {
        updateTableAll();
    }
    showRow();
}