public void sendDetailsMessage(java.util.UUID clientID, java.util.UUID remoteId, java.lang.String[] position) {
    java.lang.String message = new java.lang.String(("dsfr," + (clientID.toString())));
    message += "," + (position[0]);
    message += "," + (position[1]);
    message += "," + (position[2]);
    try {
        sendPacket(message, remoteId);
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}