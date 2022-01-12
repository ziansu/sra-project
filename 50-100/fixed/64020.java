private void flushAccumulatedNotifications(boolean transactionSuccess) {
    java.util.Set<com.yahoo.squidb.data.DataChangedNotifier<?>> accumulatedNotifiers = notifierAccumulator.get();
    if (!(accumulatedNotifiers.isEmpty())) {
        for (com.yahoo.squidb.data.DataChangedNotifier<?> notifier : accumulatedNotifiers) {
            notifier.flushAccumulatedNotifications(this, (transactionSuccess && (dataChangedNotificationsEnabled)));
        }
        accumulatedNotifiers.clear();
    }
}