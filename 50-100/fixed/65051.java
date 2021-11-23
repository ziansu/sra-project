final void flushAccumulatedNotifications(com.yahoo.squidb.data.SquidDatabase database, boolean shouldSendNotifications) {
    java.util.Set<T> accumulatedNotifications = notifyObjectAccumulator.get();
    if ((enabled) && shouldSendNotifications) {
        for (T notifyObject : accumulatedNotifications) {
            sendNotification(database, notifyObject);
        }
    }
    accumulatedNotifications.clear();
}