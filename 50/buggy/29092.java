@javax.ws.rs.GET
@javax.ws.rs.Path(value = "teamid/{id}")
public javax.ws.rs.core.Response findAllWorkItemsByTeam(@javax.ws.rs.PathParam(value = "teamId")
final java.lang.Long teamId) {
    final java.util.List<se.meer.jpa.model.WorkItem> workItems = service.findAllWorkItemsByTeamId(teamId);
    return javax.ws.rs.core.Response.ok().entity(workItems).build();
}