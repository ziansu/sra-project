public boolean addNetworkUser(java.lang.String username, java.net.InetAddress IP) {
    if ((user_ledger.containsKey(username)) || (username == (own_user_name))) {
        return false;
    }
    user_ledger.put(username, IP);
    filemanager.addUser(username);
    gui.addUser(username);
    showState();
    return true;
}