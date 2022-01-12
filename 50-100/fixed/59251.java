@java.lang.Override
public void awaitRebalance() {
    while ((balancing) || (!(relocationJob.isDone()))) {
        try {
            relocationJob.get();
        } catch (java.lang.InterruptedException | java.util.concurrent.CancellationException e) {
        } catch (java.util.concurrent.ExecutionException e) {
            e.printStackTrace();
        }
    } 
}