@java.lang.Override
public void recordHistoricDetailVariableCreate(org.activiti.engine.impl.persistence.entity.VariableInstanceEntity variable, org.activiti.engine.impl.persistence.entity.ExecutionEntity sourceActivityExecution, boolean useActivityId) {
    if (isHistoryLevelAtLeast(HistoryLevel.FULL)) {
        org.activiti.engine.impl.persistence.entity.HistoricDetailVariableInstanceUpdateEntity historicVariableUpdate = org.activiti.engine.impl.persistence.entity.HistoricDetailVariableInstanceUpdateEntity.copyAndInsert(variable);
        if (useActivityId && (sourceActivityExecution != null)) {
            org.activiti.engine.impl.persistence.entity.HistoricActivityInstanceEntity historicActivityInstance = findActivityInstance(sourceActivityExecution, true);
            if (historicActivityInstance != null) {
                historicVariableUpdate.setActivityInstanceId(historicActivityInstance.getId());
            }
        }
    }
}