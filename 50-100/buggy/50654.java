@java.lang.Override
public void run() {
    while (true) {
        while (!(dead)) {
            while (canMove) {
                java.lang.System.out.println(address);
                playerAction(dialogue());
                server.sendToAll();
            } 
        } 
        java.lang.Thread.currentThread().interrupt();
    } 
}