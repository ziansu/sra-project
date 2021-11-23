public java.lang.String convertRequestToString() throws java.io.IOException {
    java.io.InputStreamReader inputStreamReader = new java.io.InputStreamReader(inputStream);
    java.io.BufferedReader bufferedReader = new java.io.BufferedReader(inputStreamReader);
    java.lang.StringBuilder requestBuilder = new java.lang.StringBuilder();
    java.lang.String line;
    do {
        line = bufferedReader.readLine();
        requestBuilder.append(line);
        if (line.equals(""))
            break;
        
    } while (bufferedReader.ready() );
    return requestBuilder.toString();
}