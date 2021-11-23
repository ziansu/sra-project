@java.lang.Override
public void deleteComponent(com.google.appinventor.shared.rpc.component.Component component) {
    if (!(component.getAuthorId().equals(userInfoProvider.getUserId()))) {
        throw com.google.appinventor.server.CrashReport.createAndLogError(com.google.appinventor.server.ComponentServiceImpl.LOG, null, (("The user who is deleting the component with id " + (component.getId())) + " is not the author."), null);
    }
    storageIo.deleteComponent(component);
}