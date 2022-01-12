final synchronized void setResponse(com.basho.riak.client.core.RiakMessage rawResponse) {
    stateCheck(com.basho.riak.client.core.FutureOperation.State.CREATED, com.basho.riak.client.core.FutureOperation.State.WRITTEN, com.basho.riak.client.core.FutureOperation.State.RETRY);
    U decodedMessage = decode(rawResponse);
    this.rawResponse.add(decodedMessage);
    exception = null;
    if (done(decodedMessage)) {
        (remainingTries)--;
        if ((retrier) != null) {
            retrier.operationComplete(this, remainingTries);
        }
        fireListeners();
        state = com.basho.riak.client.core.FutureOperation.State.COMPLETE;
        latch.countDown();
    }
}