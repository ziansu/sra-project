@java.lang.SuppressWarnings(value = "rawtypes")
public hudson.model.Descriptor getDescriptor(java.lang.String id) {
    return jenkins.model.Jenkins.getInstance().getDescriptor(id);
}