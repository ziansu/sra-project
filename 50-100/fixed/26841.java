public void done(java.lang.String args) {
    edu.wpi.disco.Plan focus = getEngine().getFocus(true);
    edu.wpi.disco.Task task = processTaskIf(args, focus, false);
    if (task != null)
        done((task.isPrimitive() ? task : new edu.wpi.disco.Propose.Done(getEngine(), true, task)), false);
    
}