public void run() {
    try {
        while (true) {
            ms.sem.acquire(1);
            ms.mutex.acquire();
            java.lang.System.out.println("Consumer read");
            ms.mutex.release();
        } 
    } catch (java.lang.Exception x) {
        x.printStackTrace();
    }
}