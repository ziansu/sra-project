@javax.ws.rs.GET
public it.finsoft.entity.Evento create(@javax.ws.rs.QueryParam(value = "entita")
java.lang.String codiceEnt, @javax.ws.rs.QueryParam(value = "tipiEvento")
java.lang.String codiceTipi, @javax.ws.rs.QueryParam(value = "tag")
java.lang.String tag) {
    it.finsoft.entity.Evento evento = new it.finsoft.entity.Evento();
    evento.setEntita(entitam.findByCod(codiceEnt));
    evento.setTipoEvento(tipoevm.findByCod(codiceTipi));
    evento.setTag(tag);
    return eventom.save(evento);
}