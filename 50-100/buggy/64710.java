public static java.lang.String readToString(java.io.Reader reader) throws java.io.IOException {
    java.io.BufferedReader bufferedReader = new java.io.BufferedReader(reader);
    java.io.StringWriter writer = new java.io.StringWriter();
    java.lang.String line = null;
    while ((line = bufferedReader.readLine()) != null) {
        writer.write(line);
    } 
    return writer.toString();
}