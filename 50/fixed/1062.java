public boolean isAssigned(@org.jetbrains.annotations.NotNull
org.labkey.workflow.model.WorkflowTask task, @org.jetbrains.annotations.NotNull
org.labkey.api.security.User user) {
    return ((task.getAssignee()) != null) && ((task.getAssignee().getUserId()) == (user.getUserId()));
}