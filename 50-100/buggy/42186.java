public boolean broadCastMessage(java.lang.String message) {
    boolean finished = true;
    java.util.Iterator<Server.ClientConnection> itr = connections.iterator();
    while (itr.hasNext()) {
        Server.ClientConnection cct = itr.next();
        if (!(cct.sendMessage(message))) {
            finished = false;
            break;
        }
    } 
    return finished;
}