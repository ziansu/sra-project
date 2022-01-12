public serguei.http.HttpResponse sendRequest(java.lang.String requestLine, java.lang.String... headers) throws java.io.IOException {
    connectIfNecessary();
    for (java.lang.String line : headers) {
        outputStream.write(line.getBytes());
        outputStream.write(HttpHeaders.LINE_SEPARATOR_BYTES);
    }
    outputStream.write(HttpHeaders.LINE_SEPARATOR_BYTES);
    outputStream.flush();
    return new serguei.http.HttpResponse(inputStream);
}