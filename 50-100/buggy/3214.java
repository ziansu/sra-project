private void disconnect(java.lang.String message) {
    if (((playerConnection) == null) || ((player) instanceof net.sf.cglib.proxy.Factory)) {
        originalChannel.disconnect();
    }else {
        try {
            com.comphenix.protocol.utility.MinecraftMethods.getDisconnectMethod(playerConnection.getClass()).invoke(playerConnection, message);
        } catch (java.lang.Exception e) {
            throw new java.lang.IllegalArgumentException("Unable to invoke disconnect method.", e);
        }
    }
}