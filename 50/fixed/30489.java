public static java.security.spec.KeySpec loadKey(java.lang.String filePath, net.smartcosmos.util.CryptoUtil.KeyFormat keyFormat) throws java.io.IOException {
    try (java.io.FileInputStream fis = new java.io.FileInputStream(new java.io.File(filePath))) {
        return net.smartcosmos.util.CryptoUtil.loadKey(fis, keyFormat);
    }
}