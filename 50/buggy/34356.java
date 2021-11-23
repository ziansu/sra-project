private void buttonAccpetActionPerformed(java.awt.event.ActionEvent evt) {
    insert();
    system.populateInvnetoryTable();
    system.populateRecipeTable();
    system.populateRecipeListTable();
    system.populateSupplierTable();
    this.dispose();
}