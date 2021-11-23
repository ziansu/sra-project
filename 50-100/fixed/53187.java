private void registerClientEvents() {
    if ((client) == null)
        return ;
    
    this.errorListener = new de.hsbremen.chat.client.ErrorListener(this.gui, this);
    client.addErrorListener(this.errorListener);
    this.serverObjectReceivedListener = new de.hsbremen.chat.client.ServerObjectListener(this.gui);
    client.addServerObjectReceivedListener(this.serverObjectReceivedListener);
}