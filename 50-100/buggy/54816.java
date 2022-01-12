private au.id.deejay.webserver.headers.Headers readHeaders(java.io.BufferedReader inputReader) throws java.io.IOException {
    au.id.deejay.webserver.headers.Headers headers = new au.id.deejay.webserver.headers.HttpHeaders();
    if (inputReader.ready()) {
        java.lang.String line = inputReader.readLine();
        while ((line != null) && (!("".equals(line)))) {
            headers.add(parseHeaderLine(line));
            line = inputReader.readLine();
        } 
    }
    return headers;
}