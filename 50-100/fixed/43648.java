private void setConnectionData(java.net.HttpURLConnection connnection, byte[] bytes) {
    if ((bytes != null) && ((bytes.length) > 0)) {
        connnection.setDoOutput(true);
        try {
            java.io.OutputStream out = connnection.getOutputStream();
            out.write(bytes);
            out.flush();
            out.close();
        } catch (java.lang.Exception cause) {
            throw new com.hp.application.automation.tools.common.SSEException(cause);
        }
    }
}