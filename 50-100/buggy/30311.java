public void consumeAckPollResponse(java.lang.String resp) {
    try {
        com.splunk.logging.AckPollResponse ackPollResp = com.splunk.logging.AckManager.mapper.readValue(resp, com.splunk.logging.AckPollResponse.class);
        this.ackWindow.remove(ackPollResp);
        if (this.ackWindow.isEmpty()) {
            this.ackPollController.stop();
        }
    } catch (java.io.IOException ex) {
        throw new java.lang.RuntimeException(ex.getMessage(), ex);
    }
}