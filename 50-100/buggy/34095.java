public java.lang.String buscarPorPessoaEData(app.model.Pessoa pessoa, java.util.Date data) {
    java.lang.String dataTmp = null;
    java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd");
    dataTmp = sdf.format(data);
    this.eventos = this.dao.findEventsByPersonIdAndDate(pessoa.getId(), dataTmp);
    for (app.model.Evento e : this.eventos) {
        app.control.EventoBean.LOGGER.info(e.toString());
    }
    return "listarEvento?faces-redirect=true";
}