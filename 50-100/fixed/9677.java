private void mathButton_ActionPerformed(java.awt.event.ActionEvent evt) {
    int[] rows = new int[mainTable_.getRowCount()];
    for (int i = 0; i < (rows.length); i++) {
        java.lang.Integer j = ((java.lang.Integer) (mainTable_.getValueAt(mainTable_.convertRowIndexToModel(i), 0)));
        rows[i] = j;
    }
    edu.valelab.gaussianfit.MathForm mf = new edu.valelab.gaussianfit.MathForm(edu.valelab.gaussianfit.DataCollectionForm.studio_.getUserProfile(), rows, rows);
    mf.setVisible(true);
}