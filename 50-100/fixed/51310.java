protected void reportIssues(java.lang.Iterable<org.eclipse.xtext.validation.Issue> issues) {
    for (org.eclipse.xtext.validation.Issue issue : issues) {
        java.lang.StringBuilder issueBuilder = createIssueMessage(issue);
        if ((org.eclipse.xtext.diagnostics.Severity.ERROR) == (issue.getSeverity())) {
            org.eclipse.xtend.core.compiler.batch.XtendBatchCompiler.log.error(issueBuilder.toString());
        }else
            if ((org.eclipse.xtext.diagnostics.Severity.WARNING) == (issue.getSeverity())) {
                org.eclipse.xtend.core.compiler.batch.XtendBatchCompiler.log.warn(issueBuilder.toString());
            }
        
    }
}