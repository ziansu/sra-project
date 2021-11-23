@java.lang.Override
protected org.eclipse.core.runtime.IStatus run(org.eclipse.core.runtime.IProgressMonitor monitor) {
    final java.io.File repoFile = entry.getFile(true);
    if (repoFile.exists()) {
        getSite().getShell().getDisplay().asyncExec(new java.lang.Runnable() {
            @java.lang.Override
            public void run() {
                openURI(repoFile.toURI());
            }
        });
    }
    return org.eclipse.core.runtime.Status.OK_STATUS;
}