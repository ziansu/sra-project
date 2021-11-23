public java.lang.String getDataEncrypterType() {
    return config.getString(io.apiman.manager.api.core.config.ApiManagerConfig.APIMAN_DATA_ENCRYPTER_TYPE, "uuid");
}