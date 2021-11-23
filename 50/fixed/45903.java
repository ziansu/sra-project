@java.lang.Override
public java.util.Map<hudson.triggers.TriggerDescriptor, hudson.triggers.Trigger<?>> getTriggers() {
    return getTriggersJobProperty().getTriggersMap();
}