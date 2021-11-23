public void berekening() {
    invoer = java.lang.Integer.parseInt(tekstvak.getText());
    if (((invoer) >= 1) && ((invoer) <= 3)) {
        stenen -= invoer;
        beurten = true;
    }else
        if (((3 < (invoer)) || ((invoer) > 5)) || ((invoer) < 0)) {
            error();
        }
    
}