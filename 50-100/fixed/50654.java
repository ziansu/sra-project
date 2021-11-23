@java.lang.Override
public void run() {
    while (true) {
        while (!(dead)) {
            java.lang.System.out.println(address);
            while (canMove) {
                playerAction(dialogue());
                server.sendToAll();
            } 
        } 
        java.lang.Thread.currentThread().interrupt();
    } 
}