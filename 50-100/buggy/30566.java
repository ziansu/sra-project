@java.lang.Override
public hudson.scm.PollingResult poll(hudson.model.TaskListener listener) {
    jenkins.scm.SCMDecisionHandler veto = jenkins.scm.SCMDecisionHandler.firstShouldPollVeto(asItem());
    if (!(veto.shouldPoll(asItem()))) {
        listener.getLogger().println(jenkins.triggers.Messages.SCMTriggerItem_PollingVetoed(veto));
        return hudson.scm.PollingResult.NO_CHANGES;
    }
    return delegate.poll(listener);
}