private void btnRecalculateActionPerformed(java.awt.event.ActionEvent evt) {
    models.Dates.getInstance().adjust(txtStartDate.getText(), txtEndDate.getText());
    recalculate(false);
}