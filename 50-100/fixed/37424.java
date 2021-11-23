private void negPosMethod() {
    if ((display.getText().indexOf("-")) == 0) {
        display.setText(display.getText().substring(1));
    }else {
        display.setText(("-" + (display.getText())));
    }
    fixDisplay(true);
}