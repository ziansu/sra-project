public void close() throws java.io.IOException {
    synchronized(task) {
        try {
            this.server.close();
        } finally {
            if ((this.task.get()) != null) {
                this.task.get().cancel(true);
                this.task.set(null);
            }
        }
    }
}