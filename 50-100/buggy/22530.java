@java.lang.Override
protected void doReportBug(pl.touk.sputnik.processor.findbugs.BugInstance bugInstance) {
    pl.touk.sputnik.processor.findbugs.SourceLineAnnotation primarySourceLineAnnotation = bugInstance.getPrimarySourceLineAnnotation();
    pl.touk.sputnik.review.Violation violation = new pl.touk.sputnik.review.Violation(primarySourceLineAnnotation.getClassName(), primarySourceLineAnnotation.getStartLine(), bugInstance.getMessage(), convert(bugInstance.getPriority()));
    log.debug("Violation found: {}", violation);
    reviewResult.add(violation);
}