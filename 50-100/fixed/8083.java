public static com.dabsquared.gitlabjenkins.trigger.handler.merge.MergeRequestHookTriggerHandler newMergeRequestHookTriggerHandler(boolean triggerOnMergeRequest, com.dabsquared.gitlabjenkins.trigger.TriggerOpenMergeRequest triggerOpenMergeRequest, boolean skipWorkInProgressMergeRequest) {
    if (triggerOnMergeRequest || (triggerOpenMergeRequest != (com.dabsquared.gitlabjenkins.trigger.TriggerOpenMergeRequest.never))) {
        return new com.dabsquared.gitlabjenkins.trigger.handler.merge.MergeRequestHookTriggerHandlerImpl(com.dabsquared.gitlabjenkins.trigger.handler.merge.MergeRequestHookTriggerHandlerFactory.retrieveAllowedStates(triggerOnMergeRequest, triggerOpenMergeRequest), skipWorkInProgressMergeRequest);
    }else {
        return new com.dabsquared.gitlabjenkins.trigger.handler.merge.NopMergeRequestHookTriggerHandler();
    }
}