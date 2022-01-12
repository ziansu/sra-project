private java.lang.String someReader() {
    java.io.InputStream inputStream = java.lang.System.in;
    java.io.Reader inputStreamReader = new java.io.InputStreamReader(inputStream);
    java.io.BufferedReader reader = new java.io.BufferedReader(inputStreamReader);
    java.lang.String input = null;
    try {
        input = reader.readLine();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
    return input;
}