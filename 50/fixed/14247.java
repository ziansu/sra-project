public void removerFilme(classes.ufrpe.cine_easyplex.beans.Filme filme) throws classes.ufrpe.cine_easyplex.Exceptions.ValorInvalidoException {
    this.repositorioFilmes.remover(filme);
}