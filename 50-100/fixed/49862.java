private void finishRequest(java.io.OutputStream outputStream, java.lang.String responseCode, java.lang.String err) throws java.io.IOException {
    org.json.simple.JSONObject responseJson = new org.json.simple.JSONObject();
    responseJson.put("statusCode", responseCode);
    if (err != null) {
        responseJson.put("exception", err);
    }
    java.io.OutputStreamWriter writer = new java.io.OutputStreamWriter(outputStream, "UTF-8");
    writer.write(responseJson.toJSONString());
    writer.close();
}