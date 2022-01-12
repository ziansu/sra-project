public boolean sendRequest(int id) {
    boolean found = false;
    boolean requestSent = false;
    for (org.cbsbh.model.routing.OutputChannel channel : allChannels) {
        if ((channel.getNextNodeId()) == id) {
            found = true;
            if (channel.hasSignal(SignalArray.STRB_SIG)) {
                requestSent = true;
                channel.getRra().requestToSend(this);
            }
            break;
        }
    }
    assert found : ("Input channel with id " + id) + " not found. A bitch, ain't it?";
    return requestSent;
}