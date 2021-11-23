private static void closeRespone(org.apache.http.client.methods.CloseableHttpResponse httpResponse) {
    try {
        httpResponse.close();
    } catch (java.io.IOException e) {
        meizhitu.Main.log.error(e.getMessage(), e);
    }
}