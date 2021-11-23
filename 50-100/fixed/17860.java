public boolean checkTmpFileSize() {
    final java.io.File tmpFile = fast.simple.download.utils.IOUtils.getRawFile(getTmpFilePath());
    if (tmpFile == null) {
        return false;
    }
    if (((mFirstBytePosition) > 0) && ((mLastBytePosition) > 0)) {
        return (((mLastBytePosition) - (mFirstBytePosition)) + 1) == (tmpFile.length());
    }
    return (mFileSize) == (tmpFile.length());
}