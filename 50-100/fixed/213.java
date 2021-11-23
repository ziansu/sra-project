@java.lang.Override
public javax.ws.rs.core.Response toResponse(entity.exceptions.CompanyNotFoundException e) {
    entity.exceptions.ErrorMessage err = new entity.exceptions.ErrorMessage(e, 404, true);
    err.setDescription("Company was not found!");
    return javax.ws.rs.core.Response.status(404).entity(entity.exceptions.CompanyNotFoundExceptionMapper.gson.toJson(err)).type(MediaType.APPLICATION_JSON).build();
}