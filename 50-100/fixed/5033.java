public void run() {
    try {
        java.io.BufferedReader user = new java.io.BufferedReader(new java.io.InputStreamReader(java.lang.System.in));
        while (true) {
            java.lang.String command = user.readLine().trim();
            if ((command.length()) == 0)
                continue;
            
            if (process(command))
                break;
            
        } 
    } catch (java.io.IOException ignored) {
    } finally {
        java.lang.System.out.println(((server.socket().getRemoteSocketAddress()) + " disconnected"));
    }
}