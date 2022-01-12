@javax.ws.rs.POST
@javax.ws.rs.Path(value = "/agregarCaso")
@javax.ws.rs.Produces(value = javax.ws.rs.core.MediaType.TEXT_HTML)
public java.lang.String agregarCaso(@javax.ws.rs.QueryParam(value = "usrKey")
java.lang.String usuarioActual, @javax.ws.rs.QueryParam(value = "iUE")
java.lang.String iUE, @javax.ws.rs.QueryParam(value = "juzgado")
java.lang.String juzgado, @javax.ws.rs.QueryParam(value = "turno")
int turno, @javax.ws.rs.QueryParam(value = "caratulado")
java.lang.String caratulado) {
    try {
        return logica.ControladoraCaso.agregarCaso(usuarioActual, iUE, juzgado, turno, caratulado);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
        return e.getMessage();
    }
}