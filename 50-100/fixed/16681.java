private void broadcastClientMessage(java.lang.String message) {
    for (int i = 0; i < (numberConnections); i++) {
        try {
            toClientStreams.get(i).writeUTF(message);
        } catch (java.io.IOException e) {
            java.lang.System.out.println((("Exception: " + (e.getMessage())) + " in broadClientMessage()."));
        }
    }
}