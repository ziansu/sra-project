public void send(java.lang.String msg) {
    try {
        Out.println(msg);
    } catch (java.lang.Exception ex) {
        java.lang.System.out.println("Exception SocketClient send()");
    }
}