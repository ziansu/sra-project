private void btnCadastroAeroActionPerformed(java.awt.event.ActionEvent evt) {
    try {
        java.sql.PreparedStatement pst = conexao.conn.prepareStatement("insert into cliente(nome,cpf) values(?,?)");
        pst.setString(1, txtNome.getText());
        pst.setString(2, txtCPF.getText());
        pst.executeUpdate();
        javax.swing.JOptionPane.showMessageDialog(rootPane, "Cliente Cadastrado");
    } catch (java.sql.SQLException ex) {
        javax.swing.JOptionPane.showMessageDialog(rootPane, ("Erro na hora de inserir. Tente Novamente!\n Erro" + ex));
    }
}