@java.lang.Override
public void handle(org.sonar.api.server.ws.Request request, org.sonar.api.server.ws.Response response) throws java.lang.Exception {
    java.lang.String componentKey = request.mandatoryParam("component");
    org.sonar.api.rule.RuleKey ruleKey = org.sonar.api.rule.RuleKey.parse(request.mandatoryParam("rule"));
    org.sonar.core.issue.DefaultIssue issue = issueService.createManualIssue(componentKey, ruleKey, request.paramAsInt("line"), request.param("message"), request.param("severity"), null);
    responseWriter.write(issue.key(), request, response);
}