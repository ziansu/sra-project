public boolean sendRequest(int id) {
    boolean found = false;
    for (org.cbsbh.model.routing.OutputChannel channel : allChannels) {
        if ((channel.getNextNodeId()) == id) {
            found = true;
            channel.getRra().requestToSend(this);
            break;
        }
    }
    assert found : ("Input channel with id " + id) + " not found. A bitch, ain't it?";
    return found;
}