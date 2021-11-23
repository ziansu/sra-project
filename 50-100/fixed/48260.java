@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    lblTotalCost.setText((("Total Cost: R" + (java.lang.String.valueOf(o.calculateQuote(java.lang.Integer.parseInt(txtTwo.getText()), java.lang.Integer.parseInt(txtThree.getText()), java.lang.Integer.parseInt(txtSix.getText()), java.lang.Integer.parseInt(txtTwelve.getText()), java.lang.Integer.parseInt(txtBlock.getText()))))) + "0"));
}