public void writeCmdToAllExcept(hu.berzsenyi.exchange.net.msg.Msg o, java.lang.String addr) {
    synchronized(this.clients) {
        for (int i = 0; i < (clients.size()); i++)
            if (!(clients.get(i).getAddrString().equals(addr))) {
                clients.get(i).writeCommand(o);
                if (!(clients.get(i).open))
                    clients.remove((i--));
                
            }
        
    }
}