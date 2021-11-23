protected void populatePanel() {
    java.lang.String[] addresses = webchatinterface.server.util.BlacklistManager.getBlacklistedAddresses();
    for (java.lang.String address : addresses)
        this.IPFilterEditor.append((address + "\n"));
    
}