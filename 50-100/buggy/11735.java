@java.lang.Override
public void start(T project, boolean newInstance) {
    org.jenkinsci.plugins.rabbitmqbuildtrigger.RemoteBuildListener listener = org.jenkinsci.plugins.rabbitmqconsumer.extensions.MessageQueueListener.all().get(org.jenkinsci.plugins.rabbitmqbuildtrigger.RemoteBuildListener.class);
    if (listener != null) {
        listener.addTrigger(this);
    }
    super.start(project, newInstance);
    removeDuplicatedTrigger(listener.getTriggers());
}