@java.lang.Override
public cz.metacentrum.perun.taskslib.model.Task removeTask(cz.metacentrum.perun.taskslib.model.Task task) throws cz.metacentrum.perun.taskslib.exceptions.TaskStoreException {
    cz.metacentrum.perun.taskslib.model.Task idRemoved = tasksById.remove(task.getId());
    cz.metacentrum.perun.taskslib.model.Task otherRemoved = tasksByFacilityAndExecService.remove(new cz.metacentrum.perun.core.api.Pair(task.getFacility(), task.getExecService()));
    if (idRemoved != otherRemoved) {
        cz.metacentrum.perun.taskslib.service.impl.TaskStoreImpl.log.error("Inconsistent state occurred after removing Task {} from TaskStore", task);
        throw new cz.metacentrum.perun.taskslib.exceptions.TaskStoreException("Unable to remove Task properly.");
    }
    return idRemoved;
}