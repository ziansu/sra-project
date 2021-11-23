public synchronized void close() {
    if ((++(streamsDone)) == 2) {
        java.lang.System.err.println("Closeall");
        observer.onCompleted();
    }
}