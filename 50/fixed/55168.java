@java.lang.Override
public void widgetSelected(org.eclipse.swt.events.SelectionEvent e) {
    selectedPlotType = plotTypeCombo.getText();
    if ((plottedEntry) != null) {
        drawSelection(new org.eclipse.jface.viewers.StructuredSelection(plottedEntry));
    }
}