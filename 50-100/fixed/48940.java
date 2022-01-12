public void widgetSelected(org.eclipse.swt.events.SelectionEvent e) {
    java.lang.String selectedObject = m_almRepoCombo.getSelectedObject();
    if (selectedObject != null) {
        org.eclipse.core.runtime.IStatus connectionStatus = org.eclipse.jubula.client.alm.mylyn.core.utils.ALMAccess.testConnection(selectedObject);
        if (connectionStatus.isOK()) {
            m_connectionTest.setImage(IconConstants.STEP_OK_IMAGE);
            setErrorMessage(null);
        }else {
            m_connectionTest.setImage(IconConstants.ERROR_IMAGE);
            setErrorMessage(connectionStatus.getMessage());
        }
    }else {
        m_connectionTest.setImage(null);
        setErrorMessage(null);
    }
}