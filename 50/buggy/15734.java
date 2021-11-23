private com.daoman.task.domain.job.JobDefinition defaultDefinition(com.daoman.task.domain.job.JobDefinition definition) {
    definition.setIsInUse(JobDefinition.INUSE_FALSE);
    definition.setJobGroup(JobDefinition.GROUP_TASK);
    return definition;
}