@java.lang.Override
public org.eclipse.core.runtime.IStatus redo(org.eclipse.core.runtime.IProgressMonitor monitor, org.eclipse.core.runtime.IAdaptable adapt) {
    setSourcePath(newPath, false);
    org.eclipse.core.runtime.IStatus s = super.redo(monitor, adapt);
    return s;
}