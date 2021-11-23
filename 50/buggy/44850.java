@java.lang.Override
@javax.ws.rs.GET
@javax.ws.rs.Path(value = "/createListaOdpowiedziZamknietych/{idque}")
public java.lang.String createListaOdpowiedziZamknietych(@javax.ws.rs.PathParam(value = "idque")
int idque) {
    pl.ankiety.ListaOdpowiedziZamknietych listaOdpowiedziZamknietych = new pl.ankiety.ListaOdpowiedziZamknietych();
    pl.ankiety.Pytanie pytanie = bean.findPytanie(idque);
    listaOdpowiedziZamknietych.setPytanie(pytanie);
    bean.createListaOdpowiedziZamknietych(listaOdpowiedziZamknietych);
    return "dodano listaOdpowiedziZamknietych";
}