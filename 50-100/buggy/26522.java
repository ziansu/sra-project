public static void main(java.lang.String[] args) {
    try {
        cs451.checkers.server.Server.getInstance();
    } catch (java.lang.Exception e) {
        java.lang.System.err.println(("Server disconnected at " + (java.util.Calendar.getInstance().getTime())));
        e.printStackTrace();
    }
}