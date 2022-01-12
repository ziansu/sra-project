public void actionPerformed(java.awt.event.ActionEvent arg0) {
    s.setBrTel(txtBrTel.getText());
    s.setEmail(txtEmail.getText());
    s.setUplaceno(java.lang.Integer.parseInt(txtUplaceno.getText()));
    controller.GUIKontroler.osvezi(s);
    controller.GUIKontroler.pokreniDodajCasProzor(s);
}