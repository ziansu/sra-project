@java.lang.Override
public void run() {
    while (!(stop)) {
        mapToCluster();
        ned.types.Session.getInstance().message(Session.DEBUG, "Reader", "doing some cleanup...");
        gd.flushClusters(out);
        try {
            java.lang.Thread.sleep(4000);
        } catch (java.lang.InterruptedException e) {
            e.printStackTrace();
        }
    } 
    while (!(mapToCluster())) {
    } 
    gd.flushClustersAll(out);
}