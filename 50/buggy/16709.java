@javax.ws.rs.GET
@javax.ws.rs.Path(value = "/obtenerCasos")
@javax.ws.rs.Produces(value = javax.ws.rs.core.MediaType.APPLICATION_JSON)
public java.util.ArrayList<logica.Caso> obtenerCasos(@javax.ws.rs.QueryParam(value = "usrKey")
java.lang.String usuarioActual) {
    java.util.ArrayList<logica.Caso> casos = null;
    try {
        casos = logica.ControladoraCaso.obtenerCasos(usuarioActual);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    return casos;
}