@org.junit.Test(expected = org.bonitasoft.forms.client.model.exception.ForbiddenFormAccessException.class)
public void asignTaskIfNotAssigned_should_throw_exception_if_the_task_is_already_assigned_to_someone_else() throws java.lang.Exception {
    final long userId = 25L;
    final long activityInstanceID = 42L;
    doReturn(humanTaskInstance).when(processApi).getHumanTaskInstance(activityInstanceID);
    doReturn(33L).when(humanTaskInstance).getAssigneeId();
    doReturn(userId).when(session).getUserId();
    formWorkflowAPIImpl.assignTaskIfNotAssigned(session, activityInstanceID, session.getUserId());
}