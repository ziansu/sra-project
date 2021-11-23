@juja.microservices.teams.controller.PutMapping(value = "/users/{uuid}", produces = "application/json")
public org.springframework.http.ResponseEntity<?> dismissTeam(@juja.microservices.teams.controller.PathVariable
java.lang.String uuid) {
    logger.debug("Received dismiss team request. User id in Team: {}", uuid);
    juja.microservices.teams.entity.Team team = teamService.dismissTeam(uuid);
    logger.info("Team dismissed. Team Id: {}", team.getId());
    logger.debug("Request dismiss team returned {}", team.toString());
    return org.springframework.http.ResponseEntity.ok(team);
}