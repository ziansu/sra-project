@org.junit.Test
public void asignTaskIfNotAssigned_should_call_engine() throws java.lang.Exception {
    final long userId = 25L;
    final long activityInstanceID = 42L;
    org.mockito.Mockito.doReturn(humanTaskInstance).when(processApi).getHumanTaskInstance(activityInstanceID);
    org.mockito.Mockito.doReturn(0L).when(humanTaskInstance).getAssigneeId();
    org.mockito.Mockito.doReturn(userId).when(session).getUserId();
    formWorkflowAPIImpl.assignTaskIfNotAssigned(session, activityInstanceID, session.getUserId());
    org.mockito.Mockito.verify(processApi).assignUserTask(activityInstanceID, userId);
}