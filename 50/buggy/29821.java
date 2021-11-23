public io.atomix.copycat.client.request.PublishRequest.Builder withMessage(java.lang.Object message) {
    request.message = io.atomix.catalyst.util.Assert.notNull(message, "message");
    return this;
}