private void processRequest(ru.codeninja.proxyapp.connection.UrlConnection urlConnection, javax.servlet.http.HttpServletRequest req, javax.servlet.http.HttpServletResponse resp) throws java.io.IOException {
    ru.codeninja.proxyapp.request.RequestedUrl url = requestParamParser.getUrl(req);
    if (url == null) {
    }else {
        ru.codeninja.proxyapp.connection.ProxyConnection connection = urlConnection.connect(url);
        if (connection == null) {
        }else {
            responseHeadersManager.sendHeaders(resp, connection);
            ru.codeninja.proxyapp.response.writer.ResponseWriter responseWriter = responseWriterFactory.get(connection);
            responseWriter.sendResponse(connection, resp);
        }
    }
}