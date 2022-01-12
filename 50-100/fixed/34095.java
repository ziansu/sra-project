public java.lang.String buscarPorPessoaEData(app.model.Pessoa pessoa, java.util.Date data) {
    this.eventos = this.dao.findEventsByPersonIdAndDate(pessoa.getId(), data);
    for (app.model.Evento e : this.eventos) {
        app.control.EventoBean.LOGGER.info(e.toString());
    }
    return "listarEvento?faces-redirect=true";
}