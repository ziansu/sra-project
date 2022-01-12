@java.lang.Override
protected org.eclipse.core.runtime.IStatus run(final org.eclipse.core.runtime.IProgressMonitor monitor) {
    msi.gama.lang.gaml.resource.GamlResourceDocManager.DocumentationTask task = msi.gama.lang.gaml.resource.GamlResourceDocManager.DocumentationQueue.poll();
    while (task != null) {
        task.process();
        task = msi.gama.lang.gaml.resource.GamlResourceDocManager.DocumentationQueue.poll();
    } 
    final java.lang.Runnable r = msi.gama.lang.gaml.resource.GamlResourceDocManager.CleanupTasks.poll();
    while (r != null) {
        r.run();
    } 
    return org.eclipse.core.runtime.Status.OK_STATUS;
}