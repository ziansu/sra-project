protected com.wade.webserver.Response getNotFoundResponse() {
    com.wade.webserver.Response r = newFixedLengthResponse(Response.Status.NOT_FOUND, NanoHTTPD.MIME_PLAINTEXT, "Error 404, file not found.");
    android.util.Log.i(TAG, (("MyServer.getNotFoundResponse(" + (r.toString())) + ")"));
    return r;
}