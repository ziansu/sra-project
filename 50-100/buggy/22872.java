@java.lang.Override
public void mouseClicked(java.awt.event.MouseEvent e) {
    java.lang.String input = inputTextField.getText();
    java.lang.String output = "";
    if (decimalToHexRadioButton.isSelected()) {
        output = decimalToHexConverter.decimalToHex(java.lang.Integer.parseInt(input));
    }else
        if (hexToDecimalRadioButton.isSelected()) {
            output = java.lang.Long.toString(hexToDecimalConverter.hexToDecimal(input));
        }
    
    outputTextField.setText(output);
}