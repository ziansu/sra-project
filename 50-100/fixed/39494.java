@java.lang.Override
public void run() {
    com.roboclub.robobuggy.ros.Message m;
    while (true) {
        synchronized(local_inbox) {
            while (true) {
                try {
                    local_inbox.wait();
                    break;
                } catch (java.lang.InterruptedException ie) {
                    java.lang.System.out.println("much awoken for no reason, such wow");
                }
            } 
            m = local_inbox.poll();
        }
        assert m != null;
        callback.actionPerformed(topicName, m);
    } 
}