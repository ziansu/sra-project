public com.neovisionaries.ws.client.WebSocket sendFrame(com.neovisionaries.ws.client.WebSocketFrame frame) {
    if (frame == null) {
        return this;
    }
    synchronized(mStateManager) {
        com.neovisionaries.ws.client.WebSocketState state = mStateManager.getState();
        if ((state != (com.neovisionaries.ws.client.WebSocketState.OPEN)) && (state != (com.neovisionaries.ws.client.WebSocketState.CLOSING))) {
            return this;
        }
        mWritingThread.queueFrame(frame);
    }
    return this;
}