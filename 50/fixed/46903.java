@java.lang.Override
public org.eclipse.core.runtime.IStatus redo(org.eclipse.core.runtime.IProgressMonitor monitor, org.eclipse.core.runtime.IAdaptable adapt) {
    setSourcePath(newPath, false);
    return super.redo(monitor, adapt);
}