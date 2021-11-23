private void downloadComplete() {
    m_downloadProgress = 1.0F;
    com.chilliworks.chillisource.googleplay.networking.ApkExpansionDownloader.ApkExpansion apkExpansion = new com.chilliworks.chillisource.googleplay.networking.ApkExpansionDownloader.ApkExpansion();
    apkExpansion.m_versionCode = calcExpansionVersionCodeFromFile();
    apkExpansion.m_fileSize = calcExpansionFileSize(apkExpansion.m_versionCode);
    writeExpansionCache(apkExpansion);
    cleanupClientStub();
    onStateChangedComplete();
}