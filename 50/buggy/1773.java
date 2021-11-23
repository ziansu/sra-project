protected void populatePanel() {
    java.lang.String[] addresses = webchatinterface.server.util.BlacklistManager.getBlacklistedAddresses();
    if ((addresses.length) == 0)
        return ;
    
    for (java.lang.String address : addresses)
        this.IPFilterEditor.append((address + "\n"));
    
}