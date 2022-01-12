@java.lang.Override
public boolean hasNext() {
    while ((!(asyncIndexer.isDone())) && ((queue.size()) == 0)) {
        try {
            java.lang.Thread.sleep(100);
        } catch (java.lang.InterruptedException e) {
        }
    } 
    return (queue.size()) > 0;
}