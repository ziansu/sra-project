public io.spire.api.Events longPoll(io.spire.api.Message.MessageOptions options) throws io.spire.request.ResponseException, java.io.IOException {
    if ((options.timeout) == (defaultMessageOptions.timeout))
        options.timeout = this.longPollTimeout;
    
    options.timestamp = this.lastTimestamp;
    return this.longPoll(options, false);
}