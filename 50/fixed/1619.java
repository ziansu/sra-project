@java.lang.Override
void afterDownloadSucceed() throws java.io.IOException {
    mFIS.flush();
    mFIS.close();
}