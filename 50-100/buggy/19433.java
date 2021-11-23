private void jbtnBitcoinActionPerformed(java.awt.event.ActionEvent evt) {
    double usdAmt = java.lang.Double.parseDouble(jlblTotalAmt.getText());
    double btcAmt = usdAmt / 1000;
    jpBitcoinPayment = new javax.swing.JPanel();
    jpBitcoinPayment.setVisible(true);
    jpCashPayment.setVisible(false);
    jtfBitcoinAmt.setText(java.lang.String.valueOf(btcAmt));
}