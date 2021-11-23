@javax.ws.rs.POST
@javax.ws.rs.Consumes(value = javax.ws.rs.core.MediaType.APPLICATION_JSON)
@javax.ws.rs.Produces(value = javax.ws.rs.core.MediaType.APPLICATION_JSON)
@javax.ws.rs.Path(value = "/{id}/reminder")
@io.swagger.annotations.ApiOperation(value = "sends an email reminder for a specified assessment")
@io.swagger.annotations.ApiResponses(value = { @io.swagger.annotations.ApiResponse(code = 200, message = "Reminder sent") })
public javax.ws.rs.core.Response remindRespondant(@io.swagger.annotations.ApiParam(value = "Respondant Id")
@javax.ws.rs.PathParam(value = "id")
java.lang.Long respondantId) {
    com.employmeo.data.model.Respondant respondant = respondantService.getRespondantById(respondantId);
    if ((respondant.getRespondantStatus()) <= (com.employmeo.data.model.Respondant.STATUS_STARTED)) {
        respondant.setRespondantStatus(Respondant.STATUS_REMINDED);
        respondantService.save(respondant);
    }
    emailService.sendEmailReminder(respondant);
    return javax.ws.rs.core.Response.status(Status.OK).build();
}