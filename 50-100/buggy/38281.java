public void writeCmdToAllExcept(hu.berzsenyi.exchange.net.msg.Msg o, java.lang.String addr) {
    synchronized(this.clients) {
        for (hu.berzsenyi.exchange.net.TCPServerClient client : this.clients)
            if (!(client.getAddrString().equals(addr)))
                client.writeCommand(o);
            
        
    }
}