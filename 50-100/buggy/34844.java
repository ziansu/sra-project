public void updateBotoesAtivosPorDia(java.util.Date data) {
    java.util.HashMap<java.lang.Integer, java.lang.Boolean> salasDisponiveis = br.edu.utfpr.biblioteca.salas.model.bo.SalaBO.getStatusDaSala(data);
    for (int i = 8; i <= 21; i++) {
        if (salasDisponiveis.get(i)) {
            botoesHorario.add(new br.edu.utfpr.biblioteca.salas.view.BotaoHorario(i, "verde", true));
        }else {
            botoesHorario.add(new br.edu.utfpr.biblioteca.salas.view.BotaoHorario(i, "vermelho", false));
        }
    }
}