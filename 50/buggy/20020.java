public void send(java.lang.String msg) {
    try {
        Out.println(msg);
        java.lang.System.out.println(("Outgoing : " + msg));
    } catch (java.lang.Exception ex) {
        java.lang.System.out.println("Exception SocketClient send()");
    }
}