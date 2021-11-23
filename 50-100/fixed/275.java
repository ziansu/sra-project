@javax.ws.rs.DELETE
@javax.ws.rs.Path(value = "/desasociarUsuarioACaso")
@javax.ws.rs.Produces(value = javax.ws.rs.core.MediaType.TEXT_HTML)
public java.lang.String desasociarUsuarioACaso(@javax.ws.rs.QueryParam(value = "usrKey")
java.lang.String usuarioActual, @javax.ws.rs.QueryParam(value = "usuario")
java.lang.String usuario, @javax.ws.rs.QueryParam(value = "iUE")
java.lang.String iUE) {
    try {
        return logica.ControladoraCaso.desasociarUsuarioACaso(usuarioActual, usuario, iUE);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
        return e.getMessage();
    }
}