private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {
    titleField.setText(tapes.getCurrent().getTitle());
    lengthField.setText(java.lang.Integer.toString(tapes.getCurrent().getLength()));
    isOnLoan.setSelected(tapes.getCurrent().isLent());
    videoNumberLabel.setText(((((currentNumber) + 1) + " of ") + (tapes.size())));
}