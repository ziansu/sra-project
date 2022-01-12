@java.lang.Override
public void cleanInFlight(java.lang.String clientID, int packetID) {
    java.lang.String publishKey = java.lang.String.format("%s%d", clientID, packetID);
    m_inflightStore.remove(publishKey);
    java.util.Set<java.lang.Integer> inFlightForClient = this.m_inFlightIds.get(clientID);
    if (inFlightForClient != null) {
        inFlightForClient.remove(packetID);
    }
    m_db.commit();
}