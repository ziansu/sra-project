public synchronized void connectClient(protocol.Action action, java.net.Socket socket) {
    participants.add(new server.Participant(action.getSender().toLowerCase(), socket));
    java.lang.System.out.println(("Client connected: " + (action.getSender().toLowerCase())));
    java.lang.System.out.println(participants.size());
}