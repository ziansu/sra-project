private void homeButtonActionPerformed(java.awt.event.ActionEvent evt) {
    currentNumber = 0;
    VideoTape tape = tapes.getHead();
    videoNumberLabel.setText(((((currentNumber) + 1) + " of ") + (tapes.size())));
    titleField.setText(tapes.getHead().getTitle());
    lengthField.setText(java.lang.Integer.toString(tapes.getHead().getLength()));
    isOnLoan.setSelected(tapes.getHead().isLent());
}