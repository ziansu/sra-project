public void toggleButton() throws com.nilhcem.fakesmtp.core.exception.BindPortException, com.nilhcem.fakesmtp.core.exception.InvalidPortException, com.nilhcem.fakesmtp.core.exception.OutOfRangePortException {
    if (started) {
        SMTPServerHandler.INSTANCE.stopServer();
    }else {
        int port;
        try {
            port = java.lang.Integer.parseInt(portStr);
        } catch (java.lang.NumberFormatException e) {
            throw new com.nilhcem.fakesmtp.core.exception.InvalidPortException(e);
        }
        SMTPServerHandler.INSTANCE.startServer(port, null);
    }
    started = !(started);
}