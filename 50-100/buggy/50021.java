@me.sasidhar.healthtracker.rest.GET
@me.sasidhar.healthtracker.rest.Produces(value = javax.ws.rs.core.MediaType.APPLICATION_JSON)
@me.sasidhar.healthtracker.rest.Path(value = "users/{username}/metrics")
public javax.ws.rs.core.Response getUserMetrics(@me.sasidhar.healthtracker.rest.PathParam(value = "username")
java.lang.String username) {
    me.sasidhar.healthtracker.rest.HealthTrackerUser user = userRepository.findByUsername(username);
    if (user == null) {
        return javax.ws.rs.core.Response.status(Response.Status.NOT_FOUND).type("application/json").entity("{\"error\": \"User not found\"}").build();
    }
    java.util.List<me.sasidhar.healthtracker.rest.HealthMetric> metrics = metricsRepository.findByUserId(user.getId());
    javax.ws.rs.core.Response response = javax.ws.rs.core.Response.ok(metrics).build();
    return response;
}