private java.util.List<app.model.Evento> consultarEventosEntrada(java.lang.Long pessoaId) {
    java.util.List<app.model.Evento> eventos = new java.util.ArrayList<app.model.Evento>();
    try {
        java.util.Date date = new java.util.Date();
        eventos = eventoDAO.findEventsByPersonIdAndDate(pessoaId, date.toString());
        return eventos;
    } catch (java.lang.Exception e) {
        app.control.CatracaBean.LOGGER.error("Erro!!", e);
        return eventos;
    }
}