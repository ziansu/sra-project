public void edita(br.com.caelum.geradordeprovas.models.Questao questaoEditada) {
    this.alternativa.clear();
    this.alternativa.addAll(questaoEditada.getAlternativa());
    this.alternativaCorreta = questaoEditada.getAlternativaCorreta();
    this.tags.addAll(questaoEditada.getTags());
    this.titulo = questaoEditada.getTitulo();
}