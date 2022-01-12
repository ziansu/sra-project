@java.lang.SuppressWarnings(value = "rawtypes")
private rx.Observable<io.reactivex.netty.protocol.http.client.HttpClientResponse<O>> _writeContentRaw(rx.Observable rawContent, rx.functions.Func1<?, java.lang.Boolean> flushSelector, boolean hasTrailers) {
    final io.reactivex.netty.protocol.http.client.internal.RawRequest<I, O> r = io.reactivex.netty.protocol.http.client.internal.RawRequest.create(rawRequest.getHeaders(), rawContent, flushSelector, hasTrailers, rawRequest.getRedirector());
    return new io.reactivex.netty.protocol.http.client.internal.HttpClientRequestImpl(r, client);
}