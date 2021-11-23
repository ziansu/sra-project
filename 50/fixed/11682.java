private au.id.deejay.webserver.request.RequestLine readRequestLine() throws java.io.IOException {
    return new au.id.deejay.webserver.request.RequestLine(inputReader.readLine());
}