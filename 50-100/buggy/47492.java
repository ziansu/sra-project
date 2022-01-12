private org.eclipse.jetty.websocket.api.Session getRandomUnpaired() {
    int size = ge.edu.freeuni.android.entertrainment.server.services.RandomChatService.unpairedSessions.size();
    int item = new java.util.Random().nextInt(size);
    int i = 0;
    for (org.eclipse.jetty.websocket.api.Session session : ge.edu.freeuni.android.entertrainment.server.services.RandomChatService.unpairedSessions) {
        if (i == item)
            return session;
        
        i = i + 1;
    }
    return null;
}