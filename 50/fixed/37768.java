public void setRuntime(org.eclipse.bpmn2.modeler.core.runtime.TargetRuntime targetRuntime) {
    this.targetRuntime = targetRuntime;
    java.util.Collection<org.eclipse.bpmn2.modeler.core.runtime.IRuntimeExtensionDescriptor> list = targetRuntime.getRuntimeExtensionDescriptors(getExtensionName());
    list.add(this);
}