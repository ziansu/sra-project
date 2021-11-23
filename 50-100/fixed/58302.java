@java.lang.Override
public void start() {
    for (com.meme.jordan.messagetest1.Server.Connection c : connections) {
        if (c.isInterrupted())
            connections.remove(c);
        
    }
    com.meme.jordan.messagetest1.Server.Connection t = new com.meme.jordan.messagetest1.Server.Connection();
    t.start();
    connections.add(t);
}