@org.junit.Test(expected = org.sonar.server.exceptions.NotFoundException.class)
public void fail_to_create_manual_issue_on_unknown_component() {
    org.sonar.db.component.ComponentDto project = newProject();
    userSessionRule.login("john").addProjectPermissions(UserRole.USER, project.key());
    org.sonar.db.rule.RuleDto manualRule = org.sonar.db.rule.RuleTesting.newManualRule("manualRuleKey");
    org.sonar.server.issue.IssueServiceMediumTest.tester.get(org.sonar.server.rule.db.RuleDao.class).insert(session, manualRule);
    session.commit();
    service.createManualIssue("UNKNOWN", manualRule.getKey(), null, "Fix it", Severity.MINOR, 2.0);
}