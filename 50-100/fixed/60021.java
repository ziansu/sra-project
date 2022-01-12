private void sendTokenToNext() {
    if (this.hasToken) {
        this.hasToken = false;
        interdependent.Messages.TokenMessage message = new interdependent.Messages.TokenMessage(getSimulationAgent().getNetworkIndex());
        sendToSpecific(message, nextNetwork);
        logger.info(((("At Network " + (java.lang.Integer.toString(this.getSimulationAgent().getNetworkIndex()))) + ": Send Token To Network ") + (java.lang.Integer.toString(this.nextNetwork))));
    }
}