private java.lang.String generateSslKeyName(final java.lang.String fingerPrint) {
    final java.lang.String uniqueId = fingerPrint.replace(":", "").substring(0, 20);
    return genObjectName("Cloud-Key", uniqueId);
}