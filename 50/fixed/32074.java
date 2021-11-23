public void listen() {
    try {
        java.lang.System.out.println("waiting....");
        while (true) {
            transport.listen();
            java.lang.System.out.println("waiting....");
        } 
    } catch (java.net.UnknownHostException e) {
        e.printStackTrace();
    }
}