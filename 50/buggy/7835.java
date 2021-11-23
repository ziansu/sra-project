private boolean isFinished(int currentState) {
    return (this.state.get()) == (com.navercorp.pinpoint.rpc.client.PinpointClientHandshaker.STATE_FINISHED);
}