@java.lang.Override
public java.util.List<com.liferay.portal.kernel.workflow.WorkflowTask> getWorkflowTasks(long companyId, java.lang.Boolean completed, int start, int end, com.liferay.portal.kernel.util.OrderByComparator orderByComparator) throws com.liferay.portal.kernel.workflow.WorkflowException {
    org.activiti.engine.task.TaskInfoQueryWrapper taskInfoQueryWrapper = createQueryWrapper(companyId, completed);
    java.util.List<com.liferay.portal.kernel.workflow.WorkflowTask> workflowTasks = getWorkflowTasks(taskInfoQueryWrapper, start, end, orderByComparator);
    return workflowTasks;
}