public void executeBehavior(java.lang.String executionBehavior) {
    org.rstudio.studio.client.workbench.views.source.editors.text.ace.Range range = getRangeFromBehavior(executionBehavior);
    executeRange(range, null, false);
    moveCursorAfterExecution(range, true);
}