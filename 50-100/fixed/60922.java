@java.lang.Override
public void run() {
    while (!(stop)) {
        mapToCluster();
        ned.types.Session.getInstance().message(Session.DEBUG, "Reader", "doing some cleanup...");
        gd.flushClusters(out);
    } 
    while (!(mapToCluster())) {
    } 
    gd.flushClustersAll(out);
}