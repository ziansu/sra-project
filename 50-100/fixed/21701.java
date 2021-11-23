@java.lang.Override
public void execute(final org.gradle.api.reporting.Report report) {
    org.gradle.api.internal.ConventionMapping mapping = ((org.gradle.api.internal.IConventionAware) (report)).getConventionMapping();
    mapping.map("enabled", com.google.common.util.concurrent.Callables.returning(report.getName().equals("html")));
    mapDestination(extension, reportTask, reportTask, report);
}