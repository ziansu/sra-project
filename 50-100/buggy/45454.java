public void disconnectAll() {
    int userCount;
    java.util.concurrent.ExecutorService remover = java.util.concurrent.Executors.newFixedThreadPool(cores);
    synchronized(users) {
        userCount = users.size();
    }
    for (int i = 0; i < userCount; i++) {
        final int iFinal = i;
        remover.submit(() -> disconnectUser(iFinal));
    }
}