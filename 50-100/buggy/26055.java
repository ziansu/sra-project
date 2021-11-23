protected com.threewks.thundr.http.service.gae.HttpResponseImpl headGetDelete(com.threewks.thundr.http.service.gae.HttpRequestImpl request, com.google.appengine.api.urlfetch.HTTPMethod headGetDelete) {
    com.google.appengine.api.urlfetch.FetchOptions fetchOptions = createFetchOptions(request);
    java.net.URL requestUrl = buildGetRequestUrl(request);
    com.google.appengine.api.urlfetch.HTTPRequest fetchRequest = new com.google.appengine.api.urlfetch.HTTPRequest(requestUrl, headGetDelete, fetchOptions);
    setContentTypeIfNotPresent(request, fetchRequest, ContentType.TextPlain);
    addAuthorization(request, fetchRequest);
    addHeaders(request, fetchRequest);
    addCookies(request, fetchRequest);
    addBody(request, fetchRequest);
    return fetch(fetchRequest, headGetDelete);
}