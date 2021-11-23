public void stateChanged(javax.swing.event.ChangeEvent e) {
    playerCount = ((java.lang.Number) (playerSpinner.getValue())).intValue();
    if ((playerCount) < ((tableModel.getRowCount()) + 1)) {
        tableModel.removeRow(((tableModel.getRowCount()) - 1));
    }else {
        tableModel.addRow(new java.lang.Object[]{ "Player " + ((playerCount) - 1) , "Player" + ((playerCount) - 1) });
    }
}