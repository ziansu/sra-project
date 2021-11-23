@org.junit.Test(expected = org.bonitasoft.engine.exception.DeletionException.class)
public void deleteArchivedProcessInstance_by_id_should_throw_exception_when_getArchivedProcessInstance_throws_exception() throws java.lang.Exception {
    final long archivedProcessInstanceId = 42L;
    doThrow(new org.bonitasoft.engine.core.process.instance.api.exceptions.SProcessInstanceReadException(new java.lang.Exception())).when(processInstanceService).getArchivedProcessInstancesInAllStates(org.mockito.Matchers.anyListOf(java.lang.Long.class));
    processAPI.deleteArchivedProcessInstancesInAllStates(archivedProcessInstanceId);
}