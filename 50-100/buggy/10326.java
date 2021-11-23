public void run() {
    while (started) {
        if (queue.isEmpty())
            continue;
        
        try {
            publishData(queue.take());
        } catch (java.lang.InterruptedException e) {
            e.printStackTrace();
        }
    } 
    client.stop();
    queue.clear();
}