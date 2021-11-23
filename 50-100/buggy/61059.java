public void run() {
    try {
        socket = new java.net.DatagramSocket(port);
    } catch (java.net.SocketException e) {
        logger.error(("Occured an error {}. Couldn't open a socket on this port:" + (port)), e);
    }
    while (isRunning) {
        try {
            socket.receive(request);
            handleRequest(request);
        } catch (java.io.IOException e) {
            logger.error(("There was an error {} while processing the request!" + (request.toString())), e);
        }
    } 
}