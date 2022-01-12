@javax.ws.rs.PUT
@javax.ws.rs.Path(value = "/modificarInvolucrado")
@javax.ws.rs.Produces(value = javax.ws.rs.core.MediaType.TEXT_HTML)
public java.lang.String modificarInvolucrado(@javax.ws.rs.QueryParam(value = "usrKey")
java.lang.String usuarioActual, @javax.ws.rs.QueryParam(value = "iUE")
java.lang.String iUE, @javax.ws.rs.QueryParam(value = "cedulaUsada")
java.lang.String cedulaUsada, @javax.ws.rs.QueryParam(value = "fechaDeNacimiento")
java.lang.String fechaDeNacimiento, @javax.ws.rs.QueryParam(value = "nombre")
java.lang.String nombre, @javax.ws.rs.QueryParam(value = "cedula")
java.lang.String cedula, @javax.ws.rs.QueryParam(value = "nacionalidad")
java.lang.String nacionalidad, @javax.ws.rs.QueryParam(value = "domicilio")
java.lang.String domicilio, @javax.ws.rs.QueryParam(value = "clase")
java.lang.String clase) {
    try {
        return logica.ControladoraCaso.modificarInvolucrado(usuarioActual, iUE, cedulaUsada, fechaDeNacimiento, nombre, cedula, nacionalidad, domicilio, clase);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
        return e.getMessage();
    }
}