@org.junit.Test
public void deleteArchivedProcessInstance_by_id_should_delete_archived_process_instance_when_exist() throws java.lang.Exception {
    final long processInstanceId = 42L;
    doReturn(java.util.Arrays.asList(mock(org.bonitasoft.engine.core.process.instance.model.archive.SAProcessInstance.class))).when(processInstanceService).getArchivedProcessInstancesInAllStates(org.mockito.Matchers.anyListOf(java.lang.Long.class));
    processAPI.deleteArchivedProcessInstancesInAllStates(processInstanceId);
    verify(processInstanceService).getArchivedProcessInstancesInAllStates(org.mockito.Matchers.anyListOf(java.lang.Long.class));
    verify(processInstanceService).deleteArchivedParentProcessInstancesAndElements(org.mockito.Matchers.anyListOf(org.bonitasoft.engine.core.process.instance.model.archive.SAProcessInstance.class));
}