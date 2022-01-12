void begin(boolean connectionClose) {
    begun = false;
    chunked = false;
    response.setType((head ? com.xqbase.tuna.http.HttpPacket.TYPE_RESPONSE_HEAD : request.isHttp10() ? com.xqbase.tuna.http.HttpPacket.TYPE_RESPONSE_HTTP10 : com.xqbase.tuna.http.HttpPacket.TYPE_RESPONSE));
    requestClose = connectionClose;
    sendRequest(true);
}