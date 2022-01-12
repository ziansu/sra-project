public synchronized void setIpAndStartSocket(java.lang.String t_ip, main.nerd.messenger.MainActivity t_activity) {
    m_socket = new tcp.nerd.messenger.MessengerTcpSocket(t_activity);
    m_socket.start();
    m_socket.setIpAndConnect(t_ip);
}