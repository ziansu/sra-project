@javax.ws.rs.DELETE
@javax.ws.rs.Path(value = "/eliminarCaso")
@javax.ws.rs.Produces(value = javax.ws.rs.core.MediaType.TEXT_HTML)
public java.lang.String eliminarCaso(@javax.ws.rs.QueryParam(value = "usrKey")
java.lang.String usuarioActual, @javax.ws.rs.QueryParam(value = "iUE")
java.lang.String iUE) {
    try {
        logica.ControladoraCaso.eliminarCaso(usuarioActual, iUE);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
        return e.getMessage();
    }
    return "completado";
}