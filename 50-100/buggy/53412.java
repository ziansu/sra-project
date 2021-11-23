private void refresh() {
    if ((table) == null) {
        createTable();
    }else {
        data = client.getFriendList();
        tableModel = new javax.swing.table.DefaultTableModel(data, title);
        table.setModel(tableModel);
    }
    this.repaint();
    this.updateUI();
}