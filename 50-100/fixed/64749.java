@java.lang.Override
public void run() {
    while (status.equals(ServerConstants.STATUS_ONLINE)) {
        pollEvent();
        java.lang.String event = currEvents.peek();
        if (event != null) {
            if (event.equals(ServerConstants.EVENT_DISCONNECT))
                status = ServerConstants.STATUS_OFFLINE;
            else
                if (event.equals(ServerConstants.EVENT_CONNECTED))
                    status = ServerConstants.STATUS_ONLINE;
                
            
        }
        try {
            java.lang.Thread.sleep(1000);
        } catch (java.lang.InterruptedException e) {
        }
    } 
}