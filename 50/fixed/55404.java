public static synchronized void initialize(final android.content.Context context) {
    com.udacity.stockhawk.sync.QuoteSyncJob.schedulePeriodic(context);
}