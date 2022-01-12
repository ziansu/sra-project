public void tableload() {
    Classes.Airport airPorts = new Classes.Airport();
    java.sql.ResultSet rs = airPorts.getAll();
    if (rs == null) {
        return ;
    }
    jTable1.setModel(net.proteanit.sql.DbUtils.resultSetToTableModel(rs));
    jTable1.setBackground(java.awt.Color.yellow);
}