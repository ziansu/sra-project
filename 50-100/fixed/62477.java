public static java.lang.String getCodecString(java.util.Properties props, com.intel.chimera.codec.CipherSuite cipherSuite) {
    java.lang.String configName = (com.intel.chimera.ConfigurationKeys.CHIMERA_CRYPTO_CODEC_CLASSES_KEY_PREFIX) + (com.intel.chimera.codec.CipherSuite.getConfigSuffix(cipherSuite.getName()));
    java.lang.String defaultCodecStr = null;
    if (cipherSuite.equals(CipherSuite.AES_CTR_NOPADDING)) {
        defaultCodecStr = com.intel.chimera.ConfigurationKeys.DEFAULT_CHIMERA_CRYPTO_CODEC_CLASSES_AES_CTR_NOPADDING_VALUE;
    }
    return (props.getProperty(configName)) != null ? props.getProperty(configName) : java.lang.System.getProperty(configName, defaultCodecStr);
}