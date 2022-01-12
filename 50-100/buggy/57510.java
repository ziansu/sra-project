public com.neovisionaries.ws.client.WebSocket connect() throws com.neovisionaries.ws.client.WebSocketException {
    changeStateOnConnect();
    java.util.Map<java.lang.String, java.util.List<java.lang.String>> headers;
    try {
        headers = shakeHands();
    } catch (com.neovisionaries.ws.client.WebSocketException e) {
        mStateManager.setState(com.neovisionaries.ws.client.WebSocketState.CLOSED);
        mListenerManager.callOnStateChanged(com.neovisionaries.ws.client.WebSocketState.CLOSED);
        throw e;
    }
    mStateManager.setState(com.neovisionaries.ws.client.WebSocketState.OPEN);
    mListenerManager.callOnStateChanged(com.neovisionaries.ws.client.WebSocketState.OPEN);
    mServerHeaders = headers;
    mPerMessageCompressionExtension = findAgreedPerMessageCompressionExtension();
    startThreads();
    return this;
}