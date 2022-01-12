private void sendPackets(java.util.ArrayList<sr.Packet> packets) throws java.io.IOException {
    while ((m_lastSent) != (m_winUpper)) {
        sr.Packet p = packets.get(m_actual);
        m_socket.send(p.getDatagramPacket(m_destAddr, m_destPort));
        m_timeouts.startTimer(p, sr.SelectiveRepeatUnit.PACKET_TIMEOUT);
        m_lastSent = ((m_lastSent) + 1) % (m_modulo);
        m_actual = m_actual += 1;
    } 
}