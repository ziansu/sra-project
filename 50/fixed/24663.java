private void ChangeButton(javax.swing.JButton button) {
    if (oorx) {
        button.setText("O");
        oorx = false;
    }else {
        button.setText("X");
        oorx = true;
    }
}