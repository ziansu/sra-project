@java.lang.SuppressWarnings(value = "InfiniteLoopStatement")
@java.lang.Override
public void run() {
    while (true) {
        try {
            if (!(cleanUp(queue.remove()))) {
                break;
            }
        } catch (java.lang.InterruptedException e) {
        }
    } 
}