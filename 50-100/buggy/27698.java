public void encerra() {
    br.edu.ifpi.capar.leilao.infra.dao.LeilaoDao dao = new br.edu.ifpi.capar.leilao.infra.dao.LeilaoDao();
    java.util.List<br.edu.ifpi.capar.leilao.modelo.Leilao> todosLeiloesCorrentes = dao.correntes();
    for (br.edu.ifpi.capar.leilao.modelo.Leilao leilao : todosLeiloesCorrentes) {
        if (comecouSemanaPassada(leilao)) {
            leilao.encerra();
            (total)++;
            dao.atualiza(leilao);
        }
    }
}