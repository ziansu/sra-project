public boolean send(java.lang.String str) {
    try {
        if ((out) != null) {
            out.writeUTF(str);
            com.opportunity.network.ServerConnection.log.info((("sending '" + str) + "' to server"));
            return true;
        }
    } catch (java.io.IOException e) {
        com.opportunity.network.ServerConnection.log.error(("error while sending data: " + e));
        close();
    }
    return false;
}