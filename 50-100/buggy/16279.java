@java.lang.Override
public void run() {
    try {
        while (true) {
            if (java.time.LocalTime.now().isAfter(apidemo.AnaCompute.timepoint2)) {
                apidemo.Analysis.compute(LiveData.map1);
                apidemo.AnaCompute.timepoint2 = java.time.LocalTime.now().plusSeconds(20);
            }
            if (java.lang.Thread.currentThread().isInterrupted()) {
                break;
            }
            java.lang.Thread.sleep(1000);
        } 
    } catch (java.lang.InterruptedException e) {
        java.lang.System.out.println("interrupted");
    }
}