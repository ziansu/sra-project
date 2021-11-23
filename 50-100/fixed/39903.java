@java.lang.Override
public void widgetSelected(org.eclipse.swt.events.SelectionEvent e) {
    if ((tracing.views.RequirementsView.combo.getSelectionIndex()) == 0) {
        text.setText((((("Indexing time of " + (tracing.views.VariableResources.getNumbRequirements())) + " requirement(s) is: ") + (tracing.views.VariableResources.getPassedTime())) + " seconds."));
    }else {
        text.setText(tracing.views.VariableResources.getOriginalFileContent(((tracing.views.RequirementsView.combo.getSelectionIndex()) - 1)));
    }
    tracing.views.VariableResources.displayResult(((tracing.views.RequirementsView.combo.getSelectionIndex()) - 1));
}