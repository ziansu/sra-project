@java.lang.Override
void beforeDownloadStart() throws java.io.IOException {
    if ((mFIS) != null) {
        mFIS.close();
    }
    mFIS = org.apache.commons.io.FileUtils.openOutputStream(mFile);
}