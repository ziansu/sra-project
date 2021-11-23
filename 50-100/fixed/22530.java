@java.lang.Override
protected void doReportBug(pl.touk.sputnik.processor.findbugs.BugInstance bugInstance) {
    pl.touk.sputnik.processor.findbugs.SourceLineAnnotation primarySourceLineAnnotation = bugInstance.getPrimarySourceLineAnnotation();
    int line = primarySourceLineAnnotation.getStartLine();
    if (line < 0) {
        line = 0;
    }
    pl.touk.sputnik.review.Violation violation = new pl.touk.sputnik.review.Violation(primarySourceLineAnnotation.getClassName(), line, bugInstance.getMessage(), convert(bugInstance.getPriority()));
    log.debug("Violation found: {}", violation);
    reviewResult.add(violation);
}