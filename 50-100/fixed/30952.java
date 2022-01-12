public void disconnect() {
    if (isConnect()) {
        if ((isExecutionOutput(this)) || (isDataInput(this))) {
            disconnectPin(connectedPin);
        }else {
            for (int i = 0; i < (connectedPins.size()); ++i)
                connectedPins.get(i).disconnect(this);
            
        }
    }
}