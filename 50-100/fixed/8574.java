public void addNetworkUser(java.lang.String username, java.net.InetAddress IP) {
    if ((user_ledger.containsKey(username)) || (username == (own_user_name))) {
        return ;
    }
    user_ledger.put(username, IP);
    filemanager.addUser(username);
    gui.addUser(username);
    showState();
}