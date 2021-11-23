private void InsNumFocusLost(java.awt.event.FocusEvent evt) {
    java.lang.String str = InsNum.getText();
    if ((!(Validators.PositiveValidator.isPositiveStringNum(str))) || ((str.length()) > 2)) {
        insNumError.setText("Positive 2 digits only");
        amount = -1;
        iWindow.update();
        return ;
    }else {
        insNumError.setText(" ");
        amount = java.lang.Integer.parseInt(str);
    }
    iWindow.update();
}