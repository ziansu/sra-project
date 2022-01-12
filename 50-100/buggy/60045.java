public void run(java.lang.String oldN, java.lang.String n, java.lang.String s, double x, double y, int t) {
    if (!(oldN.equals(n))) {
        NotificationServer.NotificationServerControllerTracker.ControllerTracker ct = NotificationServer.NotificationServerControllerTracker.ControllerTracker.trackObjs.get(oldN);
        ct.ctrlN = n;
        NotificationServer.NotificationServerControllerTracker.ControllerTracker.trackObjs.remove(oldN);
        NotificationServer.NotificationServerControllerTracker.ControllerTracker.trackObjs.put(oldN, ct);
    }
    NotificationServer.NotificationServerControllerTracker.ControllerTracker.trackObjs.get(n).refreshTimerTimeout(t);
}