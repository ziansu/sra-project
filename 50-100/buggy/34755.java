@javax.ws.rs.PUT
@javax.ws.rs.Path(value = "{issueId}")
public final javax.ws.rs.core.Response updateIssue(@javax.ws.rs.PathParam(value = "issueId")
final java.lang.Long id, final java.lang.String json) throws java.io.IOException, org.codehaus.jackson.JsonParseException, org.codehaus.jackson.map.JsonMappingException {
    se.eldebabe.taskboard.data.models.Issue issue = se.eldebabe.taskboard.web.services.IssueWebService.mapper.readValue(json, se.eldebabe.taskboard.data.models.Issue.class);
    issue.setId(id);
    issue = se.eldebabe.taskboard.web.services.IssueWebService.issueService.updateIssue(issue);
    if (null != issue) {
        return javax.ws.rs.core.Response.ok(se.eldebabe.taskboard.web.services.IssueWebService.mapper.writeValueAsString(issue)).build();
    }else {
        return javax.ws.rs.core.Response.status(Status.NOT_FOUND).build();
    }
}