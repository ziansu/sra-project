@javax.ws.rs.PUT
@javax.ws.rs.Path(value = "/TOSCADescriptionAndStartControl")
@javax.ws.rs.Consumes(value = "application/xml")
public void setTOSCAAndStartControl(java.lang.String tosca) {
    controlCoordination.setAndStartToscaControl(tosca);
}