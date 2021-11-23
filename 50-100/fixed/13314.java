public void adicionarPeoesTabuleiro() {
    if ((controllerJogo.getJogador()) != null) {
        this.peaoPrincipal = controllerJogo.getJogador().getPeao();
        this.removeAll();
        this.add(peaoPrincipal);
        this.peoes = controllerJogo.getPeoes();
        for (pbl.model.jogo.Peao peao : peoes) {
            this.add(peao);
        }
        this.validate();
        repaint();
    }
}