public static boolean isGcmApiSupported(android.content.Context context) {
    try {
        return ((com.evernote.android.job.util.GcmAvailableHelper.GCM_IN_CLASSPATH) && ((com.google.android.gms.common.GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context)) == (com.google.android.gms.common.ConnectionResult.SUCCESS))) && ((com.evernote.android.job.util.GcmAvailableHelper.isGcmServiceRegistered(context)) == (com.google.android.gms.common.ConnectionResult.SUCCESS));
    } catch (java.lang.Throwable t) {
        net.vrallev.android.cat.Cat.w(t);
        return false;
    }
}