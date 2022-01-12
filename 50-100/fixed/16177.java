public void dispose() {
    java.util.Collection<org.eclipse.bpmn2.modeler.core.runtime.IRuntimeExtensionDescriptor> list = targetRuntime.getRuntimeExtensionDescriptors(getExtensionName());
    list.remove(this);
    org.eclipse.jface.util.PropertyChangeEvent event = new org.eclipse.jface.util.PropertyChangeEvent(this, org.eclipse.bpmn2.modeler.core.preferences.Bpmn2Preferences.PREF_SHOW_ADVANCED_PROPERTIES, null, new java.lang.Object());
    for (org.eclipse.bpmn2.modeler.core.preferences.Bpmn2Preferences p : org.eclipse.bpmn2.modeler.core.preferences.Bpmn2Preferences.getInstances(targetRuntime)) {
        p.propertyChange(event);
    }
}