public int httpsPort() {
    if (server.httpsPort().isDefined()) {
        return ((java.lang.Integer) (server.httpsPort().get()));
    }else {
        throw new java.lang.IllegalStateException("Server has no HTTPS port. Try starting it with \"new Server.Builder.https(<port num>)\"?");
    }
}