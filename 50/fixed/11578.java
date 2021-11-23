@java.lang.Override
protected org.eclipse.core.runtime.IStatus run(org.eclipse.core.runtime.IProgressMonitor monitor) {
    if (resources.isEmpty())
        return org.eclipse.core.runtime.Status.CANCEL_STATUS;
    
    scheduleDeleteJob(resources);
    return org.eclipse.core.runtime.Status.OK_STATUS;
}