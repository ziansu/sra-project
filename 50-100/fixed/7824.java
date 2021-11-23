private java.lang.String inputStreamToString(java.io.InputStream inputStream) throws java.io.IOException {
    java.io.Reader reader = new java.io.InputStreamReader(inputStream, "gb2312");
    java.io.BufferedReader bufferedReader = new java.io.BufferedReader(reader);
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    java.lang.String buffer;
    while ((buffer = bufferedReader.readLine()) != null) {
        sb.append(buffer).append("\n");
    } 
    inputStream.close();
    bufferedReader.close();
    reader.close();
    return sb.toString();
}