private java.io.File setupDownloadLocation() {
    java.io.File downloadLocation = new java.io.File(org.seekay.contract.configuration.GitConfigurationSource.DOWNLOAD_LOCATION);
    deleteExistingCheckout(downloadLocation);
    if (!(downloadLocation.mkdir())) {
        throw new java.lang.IllegalStateException("Unable to create download directory");
    }
    return downloadLocation;
}