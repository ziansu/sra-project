private java.io.File uncompressFile(java.io.File compressedFile) throws java.io.IOException {
    java.io.File localUncompressedStationFile = org.fogbowcloud.sebal.engine.sebal.StationStorer.unGzip(compressedFile, false);
    return localUncompressedStationFile;
}