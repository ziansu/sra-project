public int getRESTPort() {
    if ((mFileConfig) != null) {
        return mFileConfig.getPort();
    }
    return com.magnet.mmx.client.ClientTestConfigImpl.TEST_REST_PORT;
}