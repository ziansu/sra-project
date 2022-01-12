private java.lang.String generateValidThumbprint() {
    java.lang.String thumbprint = "";
    java.util.Random rand = new java.util.Random(java.lang.System.currentTimeMillis());
    for (int i = 0; i < (com.microsoft.azure.sdk.iot.service.auth.X509Thumbprint.THUMBPRINT_LENGTH); i++) {
        thumbprint += java.lang.Integer.toHexString(rand.nextInt(com.microsoft.azure.sdk.iot.service.auth.X509Thumbprint.THUMBPRINT_DIGIT_MAX));
    }
    return thumbprint;
}