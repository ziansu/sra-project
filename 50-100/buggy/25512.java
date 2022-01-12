@java.lang.Override
public org.imixs.workflow.ItemCollection getEvent(int processid, int activityid) throws org.imixs.workflow.exceptions.ModelException {
    java.util.List<org.imixs.workflow.ItemCollection> activities = findAllEventsByTask(processid);
    for (org.imixs.workflow.ItemCollection aactivity : activities) {
        if (activityid == (aactivity.getItemValueInteger("numactivityid"))) {
            return aactivity;
        }
    }
    throw new org.imixs.workflow.exceptions.ModelException(org.imixs.workflow.bpmn.BPMNModel.class.getSimpleName(), org.imixs.workflow.exceptions.ModelException.UNDEFINED_MODEL_ENTRY);
}