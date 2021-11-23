public void cancel() {
    this.asyncTask.cancel(true);
    ourTask.doCancel();
    try {
        this.asyncTask.get();
    } catch (java.lang.InterruptedException e) {
    } catch (java.util.concurrent.ExecutionException e) {
    } catch (java.util.concurrent.CancellationException e) {
    }
}