private io.reactivex.netty.protocol.http.client.internal.HttpClientRequestImpl<I, O> _writeContentRaw(rx.Observable rawContent, boolean hasTrailers) {
    final io.reactivex.netty.protocol.http.client.internal.RawRequest<I, O> r = io.reactivex.netty.protocol.http.client.internal.RawRequest.create(rawRequest.getHeaders(), rawContent, hasTrailers, rawRequest.getRedirector());
    return new io.reactivex.netty.protocol.http.client.internal.HttpClientRequestImpl(r, client);
}