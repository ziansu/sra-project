public void stop() {
    java.lang.System.out.println("Server: Begin Shutdown.");
    while (busy) {
    } 
    while ((clientCount) > 0) {
        this.remove(clients[0].getID());
        (clientCount)--;
    } 
    java.lang.System.out.println("Server: 	All Threads Closed.");
    if ((thread) != null) {
        thread = null;
    }
    java.lang.System.out.println("Server: Loop Thread Destroyed. Goodnight.");
}