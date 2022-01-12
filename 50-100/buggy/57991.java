@java.lang.Override
public void run() {
    while (!(incoming.isClosed())) {
        try {
            com.potatoes.cultivation.networking.Protocol protocol = ((com.potatoes.cultivation.networking.Protocol) (in.readObject()));
            queue.put(new com.potatoes.cultivation.networking.ServerTask(incoming, protocol));
            java.lang.Thread.sleep(100);
        } catch (java.lang.ClassNotFoundException | java.io.IOException | java.lang.InterruptedException e) {
            e.printStackTrace();
        }
    } 
}