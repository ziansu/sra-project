final void flushAccumulatedNotifications(com.yahoo.squidb.data.SquidDatabase database, boolean shouldSendNotifications) {
    java.util.Set<T> accumulatedNotifications = notifyObjectAccumulator.get();
    if ((!(enabled)) || (!shouldSendNotifications)) {
        accumulatedNotifications.clear();
        return ;
    }
    for (T notifyObject : accumulatedNotifications) {
        sendNotification(database, notifyObject);
    }
}