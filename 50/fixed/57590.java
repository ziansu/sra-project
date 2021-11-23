public int getRESTPort() {
    if ((mFileConfig) != null) {
        return mFileConfig.getRESTPort();
    }
    return com.magnet.mmx.client.ClientTestConfigImpl.TEST_REST_PORT;
}