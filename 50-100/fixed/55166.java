@java.lang.Override
public void run() {
    java.lang.System.out.println("Task Listener started!");
    while (!(incoming.isClosed())) {
        java.lang.System.out.println("Looping...");
        try {
            com.potatoes.cultivation.networking.Protocol protocol = ((com.potatoes.cultivation.networking.Protocol) (in.readObject()));
            java.lang.System.out.println("Read a new protocol from in");
            queue.put(new com.potatoes.cultivation.networking.ServerTask(incoming, out, protocol));
            java.lang.System.out.println("New task was put!");
            java.lang.Thread.sleep(100);
        } catch (java.lang.ClassNotFoundException | java.io.IOException | java.lang.InterruptedException e) {
            e.printStackTrace();
            return ;
        }
    } 
}