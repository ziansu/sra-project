@java.lang.Override
public void run() {
    multicast.MulticastMessage msg;
    try {
        while (true) {
            if ((msg = queue.get()) != null)
                java.lang.String.format(msg.toString());
            
            java.lang.Thread.sleep(timeout);
        } 
    } catch (java.lang.InterruptedException e) {
    }
}