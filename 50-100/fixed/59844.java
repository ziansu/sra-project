protected final void loop() {
    while (true) {
        try {
            barrier1.await();
        } catch (java.lang.InterruptedException ex) {
            return ;
        } catch (java.util.concurrent.BrokenBarrierException ex) {
            return ;
        }
        onSyncUpdate();
        try {
            barrier2.await();
        } catch (java.lang.InterruptedException ex) {
            return ;
        } catch (java.util.concurrent.BrokenBarrierException ex) {
            return ;
        }
        if ((running) == false) {
            return ;
        }
        onAsyncUpdate();
    } 
}