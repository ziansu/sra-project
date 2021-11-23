public void keyTyped(java.awt.event.KeyEvent arg0) {
    if (!(txtEnterAmount.getText().matches("([1-9]+\\.?\\d*)"))) {
        txtEnterAmount.setText("");
    }
}