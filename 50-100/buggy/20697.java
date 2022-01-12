private boolean isChunked(org.kaazing.gateway.transport.http.bridge.HttpRequestMessage httpRequest) throws org.apache.mina.filter.codec.ProtocolDecoderException {
    java.lang.String transferEncoding = httpRequest.getHeader("Transfer-Encoding");
    if (transferEncoding != null) {
        int semicolonAt = transferEncoding.indexOf(';');
        if (semicolonAt != (-1)) {
            transferEncoding = transferEncoding.substring(0, semicolonAt);
        }
        if ("chunked".equalsIgnoreCase(transferEncoding)) {
            return true;
        }
        throw new org.apache.mina.filter.codec.ProtocolDecoderException(("Unexpected transfer coding: " + transferEncoding));
    }
    return false;
}