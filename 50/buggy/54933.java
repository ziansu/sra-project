public void sendWithError(java.net.DatagramPacket dp) throws java.io.IOException, java.net.SocketTimeoutException {
    if ((gerarProbabilidade()) > (errorProb)) {
        send(dp);
    }else {
        throw new java.net.SocketTimeoutException();
    }
}