public void sendMessage(java.lang.String message) {
    java.io.PrintWriter out = null;
    try {
        out = new java.io.PrintWriter(socket.getOutputStream(), true);
        java.lang.System.out.println(message);
        out.println(message);
    } catch (java.io.IOException e) {
        e.printStackTrace();
    } finally {
        if (out != null)
            out.close();
        
    }
}