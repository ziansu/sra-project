@java.lang.Override
public com.ribose.jenkins.plugin.awscodecommittrigger.interfaces.SQSQueue getSqsQueue(final java.lang.String uuid) {
    final com.ribose.jenkins.plugin.awscodecommittrigger.SQSTrigger.DescriptorImpl descriptor = ((com.ribose.jenkins.plugin.awscodecommittrigger.SQSTrigger.DescriptorImpl) (jenkins.model.Jenkins.getActiveInstance().getDescriptor(com.ribose.jenkins.plugin.awscodecommittrigger.SQSTrigger.class)));
    return descriptor != null ? descriptor.getSqsQueue(uuid) : null;
}