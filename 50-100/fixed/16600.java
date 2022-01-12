private void deleteFlowNodeInstances(final long processInstanceId, final org.bonitasoft.engine.core.process.definition.model.SProcessDefinition processDefinition) throws org.bonitasoft.engine.core.process.instance.api.exceptions.SFlowNodeReadException, org.bonitasoft.engine.core.process.instance.api.exceptions.SProcessInstanceModificationException {
    java.util.List<org.bonitasoft.engine.core.process.instance.model.SFlowNodeInstance> activityInstances;
    do {
        activityInstances = activityService.getFlowNodeInstances(processInstanceId, 0, org.bonitasoft.engine.core.process.instance.impl.ProcessInstanceServiceImpl.BATCH_SIZE);
        for (final org.bonitasoft.engine.core.process.instance.model.SFlowNodeInstance activityInstance : activityInstances) {
            deleteFlowNodeInstance(activityInstance, processDefinition);
        }
    } while ((activityInstances.size()) == (org.bonitasoft.engine.core.process.instance.impl.ProcessInstanceServiceImpl.BATCH_SIZE) );
}