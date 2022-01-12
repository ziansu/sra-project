private void recursivelyProcessComponent(org.sonar.server.computation.ComputationContext context, int componentRef) {
    org.sonar.batch.protocol.output.BatchReportReader reportReader = context.getReportReader();
    org.sonar.batch.protocol.output.BatchReport.Component component = reportReader.readComponent(componentRef);
    if (component != null) {
        java.util.List<org.sonar.batch.protocol.output.BatchReport.Issue> issues = reportReader.readComponentIssues(componentRef);
        issueComputation.processComponentIssues(context, component.getUuid(), issues);
        for (java.lang.Integer childRef : component.getChildRefsList()) {
            recursivelyProcessComponent(context, childRef);
        }
    }
}