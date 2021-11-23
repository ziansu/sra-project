@javax.ws.rs.PUT
@javax.ws.rs.Path(value = "/modificarCaso")
@javax.ws.rs.Produces(value = javax.ws.rs.core.MediaType.TEXT_HTML)
public java.lang.String modificarCaso(@javax.ws.rs.QueryParam(value = "usrKey")
java.lang.String usuarioActual, @javax.ws.rs.QueryParam(value = "iUEUsado")
java.lang.String iUEUsado, @javax.ws.rs.QueryParam(value = "iUE")
java.lang.String iUE, @javax.ws.rs.QueryParam(value = "juzgado")
java.lang.String juzgado, @javax.ws.rs.QueryParam(value = "turno")
int turno, @javax.ws.rs.QueryParam(value = "caratulado")
java.lang.String caratulado) {
    try {
        logica.ControladoraCaso.modificarCaso(usuarioActual, iUEUsado, iUE, juzgado, turno, caratulado);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
        return e.getMessage();
    }
    return "completado";
}