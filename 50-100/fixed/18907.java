@javax.ws.rs.POST
@javax.ws.rs.Path(value = "/agregarInvolucrado")
@javax.ws.rs.Produces(value = javax.ws.rs.core.MediaType.TEXT_HTML)
public java.lang.String agregarInvolucrado(@javax.ws.rs.QueryParam(value = "usrKey")
java.lang.String usuarioActual, @javax.ws.rs.QueryParam(value = "iUE")
java.lang.String iUE, @javax.ws.rs.QueryParam(value = "fechaDeNacimiento")
java.lang.String fechaDeNacimiento, @javax.ws.rs.QueryParam(value = "nombre")
java.lang.String nombre, @javax.ws.rs.QueryParam(value = "cedula")
java.lang.String cedula, @javax.ws.rs.QueryParam(value = "nacionalidad")
java.lang.String nacionalidad, @javax.ws.rs.QueryParam(value = "domicilio")
java.lang.String domicilio, @javax.ws.rs.QueryParam(value = "clase")
java.lang.String clase) {
    try {
        return logica.ControladoraCaso.agregarInvolucrado(usuarioActual, iUE, fechaDeNacimiento, nombre, cedula, nacionalidad, domicilio, clase);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
        return e.getMessage();
    }
}