private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
    java.lang.String valor = javax.swing.JOptionPane.showInputDialog("Valor do emprestimo");
    if ((valor != null) | (!(valor.isEmpty()))) {
        valor = valor.trim().replace(",", ".");
        controllerJogo.pedirEmprestimo(java.lang.Integer.parseInt(valor));
    }
    atualizarInformacoesTela();
}