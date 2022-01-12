@java.lang.Override
public boolean canApplyTo(java.lang.Object o) {
    boolean b1 = o instanceof org.eclipse.bpmn2.Task;
    boolean b2 = o.getClass().isAssignableFrom(org.eclipse.bpmn2.Task.class);
    return b1 || b2;
}