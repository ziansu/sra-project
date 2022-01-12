public static void disconnect() {
    igor.korobeynikov.Engine.executorService.shutdown();
    try {
        if ((igor.korobeynikov.Engine.in) != null)
            igor.korobeynikov.Engine.in.close();
        
        if ((igor.korobeynikov.Engine.out) != null)
            igor.korobeynikov.Engine.out.close();
        
        if ((igor.korobeynikov.Engine.sock) != null)
            igor.korobeynikov.Engine.sock.close();
        
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}