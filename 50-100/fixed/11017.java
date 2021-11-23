private void addMPButtonActionPerformed(java.awt.event.ActionEvent evt) {
    es.upc.fib.prop.usParlament.presentation.State st = ((es.upc.fib.prop.usParlament.presentation.State) (stateComboBox.getSelectedItem()));
    if (((java.lang.String) (districtComboBox.getSelectedItem())) == null)
        return ;
    
    java.lang.Integer dt = java.lang.Integer.parseInt(((java.lang.String) (districtComboBox.getSelectedItem())));
    pc.addMPToCommunity(cNumb, st, dt);
    pops.updateMPsInCommunityTable();
    updateBoxes();
}