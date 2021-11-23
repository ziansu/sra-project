public void run() {
    java.lang.System.out.println("1");
    while ((transmission.getClientNum()) < 2) {
        for (int i = 0; i < 100; i++);
    } 
    java.lang.System.out.println("2");
    transmission.broadcast("test123");
    transmission.receiveMessage(0);
    transmission.receiveMessage(1);
}