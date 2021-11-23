public void disconnect() {
    if (isConnect()) {
        if ((isExecutionOutput(this)) || (isDataInput(this))) {
            disconnectPin(connectedPin);
        }else {
            for (com.littleinferno.flowchart.pin.Pin pin : connectedPins)
                pin.disconnect(this);
            
        }
    }
}