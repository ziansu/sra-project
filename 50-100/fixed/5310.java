private void homeButtonActionPerformed(java.awt.event.ActionEvent evt) {
    currentNumber = 0;
    VideoTape tape = tapes.getHead();
    titleField.setText(tapes.getHead().getTitle());
    lengthField.setText(java.lang.Integer.toString(tapes.getHead().getLength()));
    isOnLoan.setSelected(tapes.getHead().isLent());
    videoNumberLabel.setText(((((currentNumber) + 1) + " of ") + (tapes.size())));
}