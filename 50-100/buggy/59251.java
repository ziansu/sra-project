@java.lang.Override
public void awaitRebalance() {
    while ((!(relocationJob.isDone())) || (balancing)) {
        try {
            relocationJob.get();
        } catch (java.lang.InterruptedException | java.util.concurrent.CancellationException e) {
        } catch (java.util.concurrent.ExecutionException e) {
            e.printStackTrace();
        }
    } 
}