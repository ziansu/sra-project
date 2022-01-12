private static void request() {
    for (int i = 0; i < (Server.connections.size()); i++) {
        if (i == (Server.myId))
            continue;
        
        Connection currentConnection = Server.connections.get(i);
        int lastLogIndex = (Server.log.size()) - 1;
        RequestVote current = new RequestVote(Server.currentTerm, Server.myId, lastLogIndex, Server.log.get(lastLogIndex).term, currentConnection.port, currentConnection.ip);
        Server.executor.submit(current);
    }
}