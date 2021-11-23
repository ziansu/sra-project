public org.zalando.nakadi.webservice.utils.TestStreamingClient start() {
    if (!(running)) {
        running = true;
        batches.clear();
        headers.clear();
        final java.lang.Thread thread = new java.lang.Thread(this);
        thread.start();
        return this;
    }else {
        throw new java.lang.IllegalStateException("Client has not yet finished with previous run");
    }
}