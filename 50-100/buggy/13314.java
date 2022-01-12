public void adicionarPeoesTabuleiro() {
    this.removeAll();
    this.peaoPrincipal = controllerJogo.getJogador().getPeao();
    this.add(peaoPrincipal);
    this.peoes = controllerJogo.getPeoes();
    for (pbl.model.jogo.Peao peao : peoes) {
        this.add(peao);
    }
    validate();
    repaint();
}