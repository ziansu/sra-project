public io.spire.api.Events longPoll() throws io.spire.request.ResponseException, java.io.IOException {
    io.spire.api.Message.MessageOptions options = new io.spire.api.Message.MessageOptions();
    return this.longPoll(options, false);
}