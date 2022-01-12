@java.lang.Override
public void run() {
    com.roboclub.robobuggy.ros.Message m;
    synchronized(local_inbox) {
        while (true) {
            while ((local_inbox.peek()) == null) {
                try {
                    local_inbox.wait();
                } catch (java.lang.InterruptedException ie) {
                    java.lang.System.out.println("much awoken for no reason, such wow");
                }
            } 
            m = local_inbox.poll();
            if (m != null) {
                callback.actionPerformed(topicName, m);
            }
        } 
    }
}