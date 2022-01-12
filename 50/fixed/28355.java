public void actionPerformed(java.awt.event.ActionEvent e) {
    atbash.encrypt(atbashInputBox.getText());
    atbashOutputBox.setText(atbash.getEncryptedWord());
}