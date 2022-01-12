@java.lang.Override
public void propertyChange(java.beans.PropertyChangeEvent event) {
    org.eclipse.core.runtime.IStatus status = nameGroup.getStatus();
    if (status.isOK()) {
        setPageComplete(true);
        setErrorMessage(null);
        locationGroup.setProjectName(nameGroup.getProjectName());
    }else {
        setPageComplete(false);
        setErrorMessage(status.getMessage());
    }
}