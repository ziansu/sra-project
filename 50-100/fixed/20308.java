public static void main(java.lang.String[] args) {
    int size = com.zonas.App.dealArgs(args);
    java.util.concurrent.ExecutorService executor = java.util.concurrent.Executors.newCachedThreadPool();
    com.zonas.thread.UpdateIP updateIP = new com.zonas.thread.UpdateIP();
    for (int i = 0; i < size; i++) {
        executor.execute(updateIP);
    }
}