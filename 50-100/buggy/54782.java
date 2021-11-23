public modelo.Participante checkWinner() {
    int id = -1;
    for (modelo.Participante participante : participantes) {
        int pontos = this.pontuacao();
        id++;
        pontuacao_jogadores[id] += pontos;
        if (participante.noHasPeca()) {
            participante.setPontuacao(((participante.getPontuacao()) + pontos));
            (rodada)++;
            id_lastWin = id;
            return participante;
        }
    }
    return null;
}