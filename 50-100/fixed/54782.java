public modelo.Participante checkWinner() {
    int id = 0;
    for (modelo.Participante participante : participantes) {
        if (participante.noHasPeca()) {
            int pontos = this.pontuacao();
            pontuacao_jogadores[id] += pontos;
            participante.setPontuacao(((participante.getPontuacao()) + pontos));
            (rodada)++;
            id_lastWin = id;
            return participante;
        }
        id++;
    }
    return null;
}