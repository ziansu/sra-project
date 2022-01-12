@java.lang.Override
public void run() {
    multicast.MulticastMessage msg;
    try {
        while (true) {
            if ((msg = queue.get()) != null)
                java.lang.System.out.println(msg.toString());
            
            java.lang.Thread.sleep(timeout);
        } 
    } catch (java.lang.InterruptedException e) {
    }
}