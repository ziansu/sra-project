public static uw.iyyuan.jenkins.timeline.domain.Stage getPrototypeStage(java.lang.String name, java.util.List<uw.iyyuan.jenkins.timeline.domain.task.Task> tasks, java.util.List<java.lang.String> blockingJobs, java.util.List<java.lang.String> conditionalJobs, java.util.List<java.lang.String> downstreamJobs, java.lang.String promotionCriteriaJobs, java.lang.String promotionTriggerJobs, java.util.List<java.util.Map<java.lang.String, java.lang.String>> blockingCriteria) {
    return new uw.iyyuan.jenkins.timeline.domain.Stage(name, tasks, blockingJobs, conditionalJobs, downstreamJobs, promotionCriteriaJobs, promotionTriggerJobs, blockingCriteria);
}