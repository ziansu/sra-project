@java.lang.Override
public boolean hasNext() {
    while (!(asyncIndexer.isDone())) {
        if ((queue.size()) > 0) {
            return false;
        }
        try {
            java.lang.Thread.sleep(100);
        } catch (java.lang.InterruptedException e) {
        }
    } 
    return true;
}