@javax.ws.rs.POST
@javax.ws.rs.Path(value = "/asociarUsuarioACaso")
@javax.ws.rs.Produces(value = javax.ws.rs.core.MediaType.TEXT_HTML)
public java.lang.String asociarUsuarioACaso(@javax.ws.rs.QueryParam(value = "usrKey")
java.lang.String usuarioActual, @javax.ws.rs.QueryParam(value = "usuario")
java.lang.String usuario, @javax.ws.rs.QueryParam(value = "iUE")
java.lang.String iUE, @javax.ws.rs.QueryParam(value = "tipo")
java.lang.String tipo) {
    try {
        return logica.ControladoraCaso.asociarUsuarioACaso(usuarioActual, usuario, iUE, tipo);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
        return e.getMessage();
    }
}