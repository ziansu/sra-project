public synchronized void closeConnection() {
    try {
        m_socket.close();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    } catch (android.os.NetworkOnMainThreadException e) {
        m_receivt.add("ConnectionFAIL");
        main.nerd.messenger.SocketController.getInstance().setHasMsgs(true);
        return ;
    }
}