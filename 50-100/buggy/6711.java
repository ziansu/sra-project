private static java.util.List<com.dabsquared.gitlabjenkins.trigger.handler.push.PushHookTriggerHandler> retrieveHandlers(boolean triggerOnPush, com.dabsquared.gitlabjenkins.trigger.TriggerOpenMergeRequest triggerOpenMergeRequestOnPush, boolean skipWorkInProgressMergeRequest, boolean triggerOnPipelineEvent) {
    java.util.List<com.dabsquared.gitlabjenkins.trigger.handler.push.PushHookTriggerHandler> result = new java.util.ArrayList<>();
    if (triggerOnPush) {
        result.add(new com.dabsquared.gitlabjenkins.trigger.handler.push.PushHookTriggerHandlerImpl());
    }
    if (triggerOpenMergeRequestOnPush == (com.dabsquared.gitlabjenkins.trigger.TriggerOpenMergeRequest.both)) {
        result.add(new com.dabsquared.gitlabjenkins.trigger.handler.push.OpenMergeRequestPushHookTriggerHandler(skipWorkInProgressMergeRequest));
    }
    return result;
}