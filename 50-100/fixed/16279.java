@java.lang.Override
public void run() {
    while (true) {
        if (java.time.LocalTime.now().isAfter(apidemo.AnaCompute.timepoint2)) {
            apidemo.Analysis.compute(LiveData.map1);
            apidemo.AnaCompute.timepoint2 = java.time.LocalTime.now().plusSeconds(20);
        }
        if (java.lang.Thread.currentThread().isInterrupted()) {
            break;
        }
    } 
}