public void requestAccess(edu.harvard.iq.dataverse.DataFile file) {
    if (fileDownloadService.requestAccess(file.getId())) {
        file.getFileAccessRequesters().add(((edu.harvard.iq.dataverse.authorization.users.AuthenticatedUser) (session.getUser())));
        fileDownloadService.sendRequestFileAccessNotification(file.getOwner(), file.getId());
    }
}