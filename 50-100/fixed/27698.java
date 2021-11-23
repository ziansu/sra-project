public void encerra() {
    java.util.List<br.edu.ifpi.capar.leilao.modelo.Leilao> todosLeiloesCorrentes = dao.correntes();
    for (br.edu.ifpi.capar.leilao.modelo.Leilao leilao : todosLeiloesCorrentes) {
        if (comecouSemanaPassada(leilao)) {
            leilao.encerra();
            (total)++;
            dao.atualiza(leilao);
        }
    }
}