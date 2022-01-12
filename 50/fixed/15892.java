@java.lang.Override
void beforeDownloadStart() throws java.io.IOException {
    if ((mFIS) != null) {
        mFIS.close();
    }
    mFIS = new java.io.FileOutputStream(mFile);
}