public static com.dabsquared.gitlabjenkins.trigger.handler.push.PushHookTriggerHandler newPushHookTriggerHandler(boolean triggerOnPush, com.dabsquared.gitlabjenkins.trigger.TriggerOpenMergeRequest triggerOpenMergeRequestOnPush, boolean skipWorkInProgressMergeRequest, boolean triggerOnPipelineEvent) {
    if (triggerOnPush || (triggerOpenMergeRequestOnPush == (com.dabsquared.gitlabjenkins.trigger.TriggerOpenMergeRequest.both))) {
        return new com.dabsquared.gitlabjenkins.trigger.handler.push.PushHookTriggerHandlerList(com.dabsquared.gitlabjenkins.trigger.handler.push.PushHookTriggerHandlerFactory.retrieveHandlers(triggerOnPush, triggerOpenMergeRequestOnPush, skipWorkInProgressMergeRequest, triggerOnPipelineEvent));
    }else {
        return new com.dabsquared.gitlabjenkins.trigger.handler.push.NopPushHookTriggerHandler();
    }
}