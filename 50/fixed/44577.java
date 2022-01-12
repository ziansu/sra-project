private void jbtnNumDotActionPerformed(java.awt.event.ActionEvent evt) {
    if (!(cashPaymentOutput.contains("."))) {
        cashPaymentOutput += ".";
        jtfNumPad.setText(cashPaymentOutput);
    }
}