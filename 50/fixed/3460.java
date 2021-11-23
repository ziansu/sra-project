@java.lang.Override
public void addIssue(org.jboss.tools.vwatch.model.Bundle b1, org.jboss.tools.vwatch.model.Bundle b2) {
    org.jboss.tools.vwatch.model.Issue i = new org.jboss.tools.vwatch.issue.VersionDecreasedIssue(b1, b2);
    b2.getIssues().add(i);
}