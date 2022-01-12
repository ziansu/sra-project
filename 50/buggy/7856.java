public void actionPerformed(java.awt.event.ActionEvent e) {
    if ((selectCartaoExcluir) == null) {
        selectCartaoExcluir = new view.SelecionarCartao("Excluir");
    }
    selectCartaoExcluir.setVisible(true);
}