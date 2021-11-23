@javax.ws.rs.GET
@javax.ws.rs.Path(value = "/obtenerCasoPorIUE")
@javax.ws.rs.Produces(value = javax.ws.rs.core.MediaType.APPLICATION_JSON)
public logica.Caso obtenerCasoPorIUE(@javax.ws.rs.QueryParam(value = "usrKey")
java.lang.String usuarioActual, @javax.ws.rs.QueryParam(value = "iUE")
java.lang.String iUE) {
    try {
        return logica.ControladoraCaso.obtenerCasoPorIUE(usuarioActual, iUE);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
        return null;
    }
}