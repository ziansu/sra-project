public edu.wpi.disco.Task done(java.lang.String args) {
    edu.wpi.disco.Plan focus = getEngine().getFocus(true);
    edu.wpi.disco.Task task = processTaskIf(args, focus, false);
    if (task != null) {
        if (task.isPrimitive())
            done(task);
        else
            done(new edu.wpi.disco.Propose.Done(getEngine(), true, task));
        
    }
    return task;
}