@java.lang.Override
public java.lang.String call() throws java.lang.Exception {
    try {
        org.eclipse.jubula.rc.common.tester.adapter.interfaces.IComponent adapter = ((org.eclipse.jubula.rc.common.tester.adapter.interfaces.IComponent) (org.eclipse.jubula.rc.common.adaptable.AdapterFactoryRegistry.getInstance().getAdapter(org.eclipse.jubula.rc.common.tester.adapter.interfaces.IComponent.class, cell)));
        if (adapter != null) {
            return ((org.eclipse.jubula.rc.common.tester.adapter.interfaces.ITextComponent) (adapter)).getPropteryValue(name);
        }
        return null;
    } catch (org.eclipse.jubula.rc.common.exception.RobotException e) {
        throw new org.eclipse.jubula.rc.common.exception.StepExecutionException(e.getMessage(), org.eclipse.jubula.tools.internal.objects.event.EventFactory.createActionError(TestErrorEvent.PROPERTY_NOT_ACCESSABLE));
    }
}