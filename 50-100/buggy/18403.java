protected void handleDigits(java.lang.String digit) {
    if (blank) {
        text.setText(digit);
        blank = false;
    }else
        if (text.getText().equals("0"))
            text.setText(digit);
        else
            text.setText(((text.getText()) + digit));
        
    
}