public NanoHTTPD.Response handleEntryRequest(fi.iki.elonen.router.RouterNanoHTTPD.UriResource uriResource, fi.iki.elonen.NanoHTTPD.Method method, fi.iki.elonen.NanoHTTPD.IHTTPSession session) throws java.io.IOException {
    return handleEntryRequest(uriResource, method, session, fi.iki.elonen.router.RouterNanoHTTPD.normalizeUri(session.getUri()));
}