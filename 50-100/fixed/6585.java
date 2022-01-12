private static void addBodyIfExists(java.net.HttpURLConnection connection, com.android.volley.Request<?> request) throws com.android.volley.AuthFailureError, java.io.IOException {
    byte[] body = request.getBody();
    connection.addRequestProperty(com.android.volley.toolbox.HurlStack.HEADER_CONTENT_TYPE, request.getBodyContentType());
    if (body != null) {
        connection.setDoOutput(true);
        java.io.DataOutputStream out = new java.io.DataOutputStream(connection.getOutputStream());
        out.write(body);
        out.close();
    }
}