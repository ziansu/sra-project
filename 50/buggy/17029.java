protected void remove(com.dotmarketing.portlets.workflows.model.WorkflowStep step) {
    cache.remove(step.getId(), com.dotmarketing.portlets.workflows.business.STEP_GROUP);
    cache.remove(step.getId(), com.dotmarketing.portlets.workflows.business.ACTION_GROUP);
}