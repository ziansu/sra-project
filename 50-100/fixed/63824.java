private static <T extends android.os.Parcelable> T awaitControllerInfo(@android.annotation.Nullable
android.os.SynchronousResultReceiver receiver) throws java.util.concurrent.TimeoutException {
    if (receiver == null) {
        return null;
    }
    final android.os.SynchronousResultReceiver.Result result = receiver.awaitResult(com.android.server.am.BatteryStatsService.EXTERNAL_STATS_SYNC_TIMEOUT_MILLIS);
    if ((result.bundle) != null) {
        result.bundle.setDefusable(true);
        final T data = result.bundle.getParcelable(BatteryStats.RESULT_RECEIVER_CONTROLLER_KEY);
        if (data != null) {
            return data;
        }
    }
    return null;
}