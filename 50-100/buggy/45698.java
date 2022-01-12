public static java.util.List<java.lang.Class<? extends org.sonar.server.computation.step.ComputationStep>> orderedStepClasses() {
    return java.util.Arrays.asList(org.sonar.server.computation.step.ParseReportStep.class, org.sonar.server.computation.step.PersistIssuesStep.class, org.sonar.server.computation.step.SwitchSnapshotStep.class, org.sonar.server.computation.step.IndexComponentsStep.class, org.sonar.server.computation.step.PurgeDatastoresStep.class, org.sonar.server.computation.step.PersistComponentLinksStep.class, org.sonar.server.computation.step.PersistEventsStep.class, org.sonar.server.computation.step.ApplyPermissionsStep.class, org.sonar.server.computation.step.IndexIssuesStep.class, org.sonar.server.computation.step.IndexSourceLinesStep.class, org.sonar.server.computation.step.IndexViewsStep.class, org.sonar.server.computation.step.PurgeRemovedViewsStep.class, org.sonar.server.computation.step.SendIssueNotificationsStep.class);
}