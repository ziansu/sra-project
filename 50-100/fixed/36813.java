public synchronized void connectClient(protocol.Action action, java.net.Socket socket) {
    participants.add(new server.Participant(action.getSender(), socket));
    java.lang.System.out.println(("Client connected: " + (action.getSender())));
    java.lang.System.out.println(participants.size());
}