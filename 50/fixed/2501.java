private java.io.File setupDownloadLocation() {
    java.io.File downloadLocation = new java.io.File(org.seekay.contract.configuration.GitConfigurationSource.DOWNLOAD_LOCATION);
    deleteExistingCheckout(downloadLocation);
    downloadLocation.mkdir();
    return downloadLocation;
}