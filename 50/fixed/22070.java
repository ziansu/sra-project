public static void initWithBrowserHostSignature(byte[] expectedSignature) {
    if ((org.chromium.webapk.lib.client.WebApkValidator.sExpectedSignature) != null) {
        return ;
    }
    org.chromium.webapk.lib.client.WebApkValidator.sExpectedSignature = java.util.Arrays.copyOf(expectedSignature, expectedSignature.length);
}