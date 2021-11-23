public void actionPerformed(java.awt.event.ActionEvent e) {
    controller.UsuarioController.cadastrarUsuario(txtNome.getText(), txtEndereco.getText(), txtCodigo.getText(), txtEmail.getText(), new java.lang.String(txtSenha.getPassword()), java.lang.Integer.toString(cboNivelPermissao.getSelectedIndex()));
    clear();
}