private void close() {
    try {
        java.lang.System.out.println((("closing connect:" + (id)) + "..."));
        this.socket.close();
    } catch (java.lang.Exception e) {
        java.lang.System.out.println(((("close connect:" + (id)) + " failed, ") + e));
    }
}