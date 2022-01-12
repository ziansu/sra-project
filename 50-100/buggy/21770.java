private static java.lang.String getContent(org.apache.http.HttpResponse res) throws java.lang.Exception {
    java.lang.StringBuilder strb = new java.lang.StringBuilder();
    java.io.BufferedReader rd = new java.io.BufferedReader(new java.io.InputStreamReader(res.getEntity().getContent()));
    strb = new java.lang.StringBuilder();
    java.lang.String line = null;
    while (null != (line = rd.readLine())) {
        strb.append(line).append("\n");
    } 
    return strb.toString();
}