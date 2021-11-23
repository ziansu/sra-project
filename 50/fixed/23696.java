@java.lang.Override
public org.imixs.workflow.ItemCollection getTask(int processid) throws org.imixs.workflow.exceptions.ModelException {
    org.imixs.workflow.ItemCollection process = taskList.get(processid);
    if (process != null)
        return new org.imixs.workflow.ItemCollection(process);
    else
        throw new org.imixs.workflow.exceptions.ModelException(org.imixs.workflow.bpmn.BPMNModel.class.getSimpleName(), org.imixs.workflow.exceptions.ModelException.UNDEFINED_MODEL_ENTRY);
    
}