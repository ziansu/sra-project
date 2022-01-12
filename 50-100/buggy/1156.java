@java.lang.Override
public void run() {
    java.lang.System.out.println("Processor entered run method");
    while ((!(pool.isQueueEmpty(id))) && (!(java.lang.Thread.currentThread().isInterrupted()))) {
        pool.fetchTask(id).start();
    } 
    steal();
}