@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent arg0) {
    if ((register.isActiveSale()) && ((register.getCurrentSaleTotal()) != (new java.math.BigDecimal(0).setScale(2, java.math.BigDecimal.ROUND_HALF_EVEN)))) {
        java.math.BigDecimal exactAmount = register.getCurrentSaleTotal();
        if ((exactAmount.compareTo(sss.ui.PosFrame.FIVE_DOLLARS)) <= 0) {
            register.makePayment(sss.ui.PosFrame.FIVE_DOLLARS);
        }else {
            javax.swing.JOptionPane.showMessageDialog(null, "Error: Amount tendered is not enough!", "Payment Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }
    barcodeEntryField.requestFocusInWindow();
}