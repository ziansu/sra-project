public static void initWithBrowserHostSignature(byte[] expectedSignature) {
    org.chromium.webapk.lib.client.WebApkValidator.sExpectedSignature = java.util.Arrays.copyOf(expectedSignature, expectedSignature.length);
}