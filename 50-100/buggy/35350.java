@org.junit.Test(expected = org.bonitasoft.engine.exception.DeletionException.class)
public void deleteArchivedProcessInstance_by_id_should_throw_exception_when_deleteParentArchivedProcessInstanceAndElements_throws_exception() throws java.lang.Exception {
    final long archivedProcessInstanceId = 42L;
    doReturn(java.util.Collections.singletonList(mock(org.bonitasoft.engine.core.process.instance.model.archive.SAProcessInstance.class))).when(processInstanceService).getArchivedProcessInstancesInAllStates(org.mockito.Matchers.anyListOf(java.lang.Long.class));
    doThrow(new org.bonitasoft.engine.core.process.instance.api.exceptions.SProcessInstanceModificationException(new java.lang.Exception())).when(processInstanceService).deleteArchivedParentProcessInstancesAndElements(org.mockito.Matchers.anyListOf(org.bonitasoft.engine.core.process.instance.model.archive.SAProcessInstance.class));
    processAPI.deleteArchivedProcessInstancesInAllStates(archivedProcessInstanceId);
}