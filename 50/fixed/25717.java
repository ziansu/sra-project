private void downloadComplete() {
    m_downloadProgress = 1.0F;
    cleanupClientStub();
    onStateChangedComplete();
}