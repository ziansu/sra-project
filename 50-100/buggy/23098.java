@de.qaware.theo.mc.gui.GET
@de.qaware.theo.mc.gui.Produces(value = { "application/json" })
public javax.ws.rs.core.Response getConfiguration(@de.qaware.theo.mc.gui.PathParam(value = "configurationName")
java.lang.String name) throws com.fasterxml.jackson.core.JsonProcessingException, de.qaware.theo.mc.ConfigurationNotAccessibleException {
    if (missionController.configExists(name)) {
        return javax.ws.rs.core.Response.status(Response.Status.NOT_FOUND).build();
    }
    java.util.Map<java.lang.String, java.lang.String> configValues;
    configValues = missionController.getConfigValues(name);
    de.qaware.theo.mc.gui.model.DataModel entity = new de.qaware.theo.mc.gui.model.DataModel(name, configValues);
    return javax.ws.rs.core.Response.ok(objectMapper.writeValueAsBytes(entity)).build();
}