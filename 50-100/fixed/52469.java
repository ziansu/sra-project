public void run() {
    while ((transmission.getClientNum()) < 1) {
        for (int i = 0; i < 100; i++);
    } 
    transmission.broadcast("test123");
    transmission.receiveMessage(0);
}