public boolean validadeParticipacaoTrabalho(ufc.quixada.npi.contest.model.Trabalho trabalho, org.springframework.validation.Errors errors) {
    java.util.List<ufc.quixada.npi.contest.model.ParticipacaoTrabalho> listaParticipacoes = trabalho.getParticipacoes();
    for (ufc.quixada.npi.contest.model.ParticipacaoTrabalho part : listaParticipacoes) {
        return (part.getPessoa().getNome().isEmpty()) || (part.getPessoa().getEmail().isEmpty());
    }
    return false;
}