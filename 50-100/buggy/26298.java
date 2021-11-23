@org.junit.Test(expected = java.lang.IllegalArgumentException.class)
public void fail_create_manual_issue_if_rule_does_not_exists() {
    org.sonar.db.component.ComponentDto project = newProject();
    org.sonar.db.component.ComponentDto file = newFile(project);
    userSessionRule.login("john").addProjectPermissions(UserRole.USER, project.key());
    service.createManualIssue(file.key(), org.sonar.api.rule.RuleKey.of("rule", "unknown"), 10, "Fix it", null, 2.0);
}