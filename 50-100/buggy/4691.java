private void saveToStream(final org.eclipse.core.runtime.IProgressMonitor monitor, final org.csstudio.display.pvtable.persistence.PVTablePersistence persistence, final java.io.OutputStream stream) {
    if (monitor != null)
        monitor.beginTask("Save", IProgressMonitor.UNKNOWN);
    
    try {
        persistence.write(model, stream);
    } catch (java.lang.Exception ex) {
        org.csstudio.ui.util.dialogs.ExceptionDetailsErrorDialog.openError(getSite().getShell(), Messages.Error, ex);
    }
    if (monitor != null)
        monitor.done();
    
    is_dirty = false;
    firePropertyChange(IEditorPart.PROP_DIRTY);
}