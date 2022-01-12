public java.lang.Void call() throws java.lang.Exception {
    final org.eclipse.emf.emfstore.internal.server.model.versioning.LogMessage logMessage = VersioningFactory.eINSTANCE.createLogMessage();
    logMessage.setAuthor(projectSpace.getUsersession().getUsername());
    logMessage.setClientDate(new java.util.Date());
    logMessage.setMessage(commitDialog.getLogText());
    changePackage.setLogMessage(logMessage);
    return null;
}