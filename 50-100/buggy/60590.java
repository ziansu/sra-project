public void actionPerformed(java.awt.event.ActionEvent e) {
    controller.UsuarioController.cadastrarUsuario(txtNome.getText(), txtEndereco.getText(), txtCodigo.getText(), txtEmail.getText(), txtSenha.getPassword().toString(), java.lang.Integer.toString(cboNivelPermissao.getSelectedIndex()));
    clear();
}