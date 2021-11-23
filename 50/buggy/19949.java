private java.io.File uncompressFile(java.io.File compressedFile) throws java.io.IOException {
    java.io.File localUncompressedStationFile = org.fogbowcloud.sebal.engine.sebal.StationStorer.unGzip(compressedFile, true);
    if (localUncompressedStationFile.exists()) {
        compressedFile.delete();
    }
    return localUncompressedStationFile;
}