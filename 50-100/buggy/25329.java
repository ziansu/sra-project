@javax.ws.rs.POST
@javax.ws.rs.Path(value = "/volunteer/availability/save")
@javax.ws.rs.Consumes(value = { javax.ws.rs.core.MediaType.APPLICATION_JSON })
@javax.ws.rs.Produces(value = { javax.ws.rs.core.MediaType.APPLICATION_JSON })
@io.swagger.annotations.ApiOperation(value = "Service for saving details of Volunteer", notes = "", response = java.util.Map.class, responseContainer = "")
public javax.ws.rs.core.Response saveVolunteerAvailability(java.lang.String availabilityJSON) {
    java.util.Map<java.lang.String, java.lang.String> response = new java.util.HashMap<>();
    try {
        com.fasterxml.jackson.databind.node.ObjectNode objectNode = new com.fasterxml.jackson.databind.ObjectMapper().readValue(availabilityJSON, com.fasterxml.jackson.databind.node.ObjectNode.class);
        response = userOnBoardingService.saveVolunteerAvailability(objectNode);
    } catch (java.lang.Exception e) {
        org.hni.admin.service.UserServiceController._LOGGER.error("Save VolunteerAvailability Failed");
        response.put(org.hni.admin.service.ERROR, "Save VolunteerAvailability Failed");
    }
    return javax.ws.rs.core.Response.ok(response).build();
}