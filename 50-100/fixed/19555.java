@org.junit.Test
public void asignTaskIfNotAssigned_should_call_engine() throws java.lang.Exception {
    final long userId = 25L;
    final long activityInstanceID = 42L;
    doReturn(humanTaskInstance).when(processApi).getHumanTaskInstance(activityInstanceID);
    doReturn(0L).when(humanTaskInstance).getAssigneeId();
    doReturn(userId).when(session).getUserId();
    formWorkflowAPIImpl.assignTaskIfNotAssigned(session, activityInstanceID, session.getUserId());
    verify(processApi).assignUserTask(activityInstanceID, userId);
}