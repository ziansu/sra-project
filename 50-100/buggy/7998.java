public modelo.Jogada movimentaMonstro(modelo.Monstro aMonstro, modelo.Posicao posicao) {
    modelo.Posicao antiga = this.getPosicao(aMonstro.getPosicao().getLinha(), aMonstro.getPosicao().getColuna());
    antiga.setOcupante(null);
    aMonstro.getPosicao().setOcupante(null);
    posicao.setOcupante(aMonstro);
    aMonstro.setPosicao(posicao);
    return new modelo.Jogada(posicao.getLinha(), posicao.getColuna(), TipoJogada._moverMonstro, aMonstro, null, null);
}