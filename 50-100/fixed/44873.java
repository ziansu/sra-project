@java.lang.Override
public void generate(java.util.Map<java.lang.String, net.viperfish.journal2.core.CryptoInfo> target, org.apache.commons.configuration.Configuration config) {
    java.lang.String algorithm;
    if (config.containsKey(net.viperfish.journal2.crypt.CompressionProccessor.CONFIG_COMPRESSION)) {
        algorithm = config.getString(net.viperfish.journal2.crypt.CompressionProccessor.CONFIG_COMPRESSION);
    }else {
        algorithm = "GZ";
    }
    net.viperfish.journal2.core.CryptoInfo info = new net.viperfish.journal2.core.CryptoInfo();
    info.setAlgorithm(algorithm);
    target.put(net.viperfish.journal2.crypt.CompressionProccessor.CRYPTOINFO_MAPPING_KEY, info);
}