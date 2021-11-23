public boolean isFileAccessRequestMultiButtonRequired() {
    if (!(isSessionUserAuthenticated())) {
        return false;
    }
    if (!(workingVersion.getTermsOfUseAndAccess().isFileAccessRequest())) {
    }
    for (edu.harvard.iq.dataverse.FileMetadata fmd : workingVersion.getFileMetadatas()) {
        if (!(canDownloadFile(fmd))) {
            return true;
        }
    }
    return false;
}