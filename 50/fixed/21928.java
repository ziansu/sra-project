public void setLblTotal(javax.swing.JLabel lblTotal) {
    this.lblTotal = lblTotal;
    if ((semesterrechnungenTableModel.getSemester()) == null) {
        lblTotal.setText("Noch keine Semesterrechnungen erfasst.");
        return ;
    }
    lblTotal.setText(semesterrechnungenModel.getTotal(semesterrechnungenTableModel));
}