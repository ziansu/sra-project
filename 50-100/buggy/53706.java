void createEncryptionZoneKey(java.lang.String key) throws java.io.IOException, java.security.NoSuchAlgorithmException {
    final org.apache.hadoop.crypto.key.KeyProvider.Options options = org.apache.hadoop.crypto.key.KeyProvider.options(fs.getConf());
    options.setDescription(key);
    options.setBitLength(256);
    java.util.List<org.apache.hadoop.crypto.key.KeyProvider> providers = org.apache.hadoop.crypto.key.KeyProviderFactory.getProviders(fs.getConf());
    com.google.common.base.Preconditions.checkArgument(((providers.size()) > 0), "KMS configuration required for creating encryption zones");
    org.apache.hadoop.crypto.key.KeyProvider keyProvider = providers.get(0);
    keyProvider.createKey(key, options);
}