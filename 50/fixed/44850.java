@java.lang.Override
@javax.ws.rs.GET
@javax.ws.rs.Path(value = "/findPytanie/{idque}")
@javax.ws.rs.Produces(value = "application/json")
public pl.ankiety.Pytanie findPytanie(@javax.ws.rs.PathParam(value = "idque")
int idque) {
    pl.ankiety.Pytanie pytanie = bean.findPytanie(idque);
    return pytanie;
}