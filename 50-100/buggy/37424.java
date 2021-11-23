private void negPosMethod() {
    if ((display.getText().indexOf("-")) == 0) {
        display.setText(display.getText().substring(1));
    }else {
        display.setText(("-" + (display.getText())));
    }
    if ((state) == 2) {
        display.setText("-0");
        state = 3;
    }
    fixDisplay(true);
}