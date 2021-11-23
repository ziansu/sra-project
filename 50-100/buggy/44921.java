@org.junit.Test(expected = org.bonitasoft.engine.exception.UpdateException.class)
public void resume_should_throw_UpdateException_when_resuming_tenant_service_with_lifecycle_is_time_out() throws java.lang.Exception {
    org.bonitasoft.engine.service.TaskResult<java.lang.Void> taskResult = new org.bonitasoft.engine.service.TaskResult<java.lang.Void>(5L, java.util.concurrent.TimeUnit.HOURS);
    org.mockito.Mockito.doReturn(java.util.Collections.singletonMap("workService", taskResult)).when(broadcastService).execute(org.mockito.Matchers.any(org.bonitasoft.engine.api.impl.transaction.SetServiceState.class), org.mockito.Matchers.eq(tenantId));
    tenantManagementAPI.resume();
}