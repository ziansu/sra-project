@java.lang.Override
protected org.apache.http.HttpResponse doReceiveResponse(final org.apache.http.HttpRequest request, final org.apache.http.HttpClientConnection conn, final org.apache.http.protocol.HttpContext context) throws java.io.IOException, org.apache.http.HttpException {
    final org.apache.http.HttpResponse response = super.doReceiveResponse(request, conn, context);
    synchronized(listener) {
        listener.log(TranscriptListener.Type.response, response.getStatusLine().toString());
        for (org.apache.http.Header header : response.getAllHeaders()) {
            listener.log(TranscriptListener.Type.response, header.toString());
        }
    }
    return response;
}