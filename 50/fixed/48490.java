public static java.lang.String readToString(java.io.InputStream inputStream) throws java.io.IOException {
    if (inputStream == null) {
        return null;
    }
    return com.openshift.express.internal.client.utils.StreamUtils.readToString(new java.io.InputStreamReader(inputStream));
}