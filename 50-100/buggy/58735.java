@java.lang.Override
public void propertyChange(java.beans.PropertyChangeEvent event) {
    org.eclipse.core.runtime.IStatus status = nameGroup.getStatus();
    setPageComplete(status.isOK());
    setErrorMessage((status.isOK() ? null : status.getMessage()));
    locationGroup.setProjectName(nameGroup.getProjectName());
}