static java.lang.String getContent(java.io.InputStream message) {
    java.io.BufferedReader br = new java.io.BufferedReader(new java.io.InputStreamReader(message, com.google.common.base.Charsets.UTF_8));
    try {
        return br.readLine();
    } catch (java.io.IOException e) {
        return null;
    } finally {
        try {
            message.close();
        } catch (java.io.IOException e) {
        }
    }
}