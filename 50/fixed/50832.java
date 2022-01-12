public boolean close() {
    if ((br.org.cesar.knot.beamsensor.communication.WsBeamCommunication.connection) != null) {
        br.org.cesar.knot.beamsensor.communication.WsBeamCommunication.connection.disconnectSocket();
        return br.org.cesar.knot.beamsensor.communication.WsBeamCommunication.connection.isSocketConnected();
    }
    return true;
}