@java.lang.Override
public void widgetSelected(org.eclipse.swt.events.SelectionEvent e) {
    boolean noControlFlowEvents = pcg.getControlFlowEvents().isEmpty();
    boolean noDifferentiatingCallsiteEvents = (pcg.getDifferentiatingCallsitesSetA().isEmpty()) && (pcg.getDifferentiatingCallsitesSetB().isEmpty());
    if (noControlFlowEvents && noDifferentiatingCallsiteEvents) {
        com.ensoftcorp.open.commons.utilities.DisplayUtils.showError("No control flow events or differentiating callsite events are defined.");
    }else
        if (pcg.getCallGraphFunctions().isEmpty()) {
            com.ensoftcorp.open.commons.utilities.DisplayUtils.showError("Call graph context cannot be empty.");
        }else {
            com.ensoftcorp.open.commons.utilities.DisplayUtils.showError("Not implemented yet.");
        }
    
}