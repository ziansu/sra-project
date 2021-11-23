@java.lang.Override
protected org.eclipse.core.runtime.jobs.ISchedulingRule getRule(org.eclipse.debug.internal.ui.viewers.model.provisional.ILabelUpdate update) {
    org.switchyard.tools.ui.debug.structure.JavaInterfaceVariable element = ((org.switchyard.tools.ui.debug.structure.JavaInterfaceVariable) (update.getElement()));
    if (element.hasGetterExpression()) {
        return null;
    }
    return super.getRule(update);
}