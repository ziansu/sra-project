@java.lang.Override
protected java.io.InputStream produceResource(java.io.InputStream aStream) throws java.lang.Exception {
    java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(aStream));
    java.lang.String line;
    java.lang.StringBuilder builder = new java.lang.StringBuilder();
    while ((line = bufferedReader.readLine()) != null) {
        builder.append(line);
        builder.append("\n");
    } 
    java.io.InputStream inputStream = new java.io.ByteArrayInputStream(builder.toString().getBytes());
    return inputStream;
}