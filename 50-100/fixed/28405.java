public void run() {
    java.lang.String line;
    do {
        try {
            queueSemaphore.acquire();
        } catch (java.lang.InterruptedException e) {
            java.lang.System.out.println(e);
        }
        queueLock.lock();
        line = queue.poll();
        queueLock.unlock();
        handleRotations(line);
    } while (!(line.equals("")) );
}