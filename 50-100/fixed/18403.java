protected void handleDigits(java.lang.String digit) {
    if ((blank) || (text.getText().equals("0"))) {
        text.setText(digit);
        blank = false;
    }else
        text.setText(((text.getText()) + digit));
    
}