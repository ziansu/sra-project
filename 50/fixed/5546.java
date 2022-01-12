public java.lang.String getHostUser() {
    try {
        return this.getMessage().getString(communication.messages.udp.UDPMessageStatePM.TAG_HOST_USER);
    } catch (java.lang.Exception e) {
        return null;
    }
}