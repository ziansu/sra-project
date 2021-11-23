public java.lang.String convertStreamToString(java.io.InputStream is) throws java.lang.Exception {
    java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.InputStreamReader(is));
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    java.lang.String line = null;
    while ((line = reader.readLine()) != null) {
        sb.append(line).append("\n");
    } 
    reader.close();
    java.lang.String sendStr = (("" + (getDeviceId())) + ":") + (sb.toString());
    return sendStr;
}