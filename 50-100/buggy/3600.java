private static java.util.List<com.dabsquared.gitlabjenkins.gitlab.hook.model.State> retrieveAllowedStates(boolean triggerOnMergeRequest, com.dabsquared.gitlabjenkins.trigger.TriggerOpenMergeRequest triggerOpenMergeRequest, boolean triggerOnPipelineEvent) {
    java.util.List<com.dabsquared.gitlabjenkins.gitlab.hook.model.State> result = new java.util.ArrayList<>();
    if (triggerOnMergeRequest) {
        result.add(State.opened);
        result.add(State.reopened);
    }
    if (triggerOpenMergeRequest != (com.dabsquared.gitlabjenkins.trigger.TriggerOpenMergeRequest.never)) {
        result.add(State.updated);
    }
    return result;
}