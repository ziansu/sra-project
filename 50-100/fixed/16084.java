@java.lang.Override
public void keyReleased(java.awt.event.KeyEvent e) {
    java.lang.String sampleQty = sampleQtyTxt.getText();
    if ((sampleQty.length()) > 0) {
        if (!(testForInteger(sampleQty))) {
            javax.swing.JOptionPane.showMessageDialog(sampleQtyTxt, "Sample quantity must be a valid number", "Invalid Sample Quantity", 2);
            sampleQtyTxt.setText(null);
        }
    }
}