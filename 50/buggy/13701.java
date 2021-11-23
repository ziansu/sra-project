@java.lang.Override
public void onStart() {
    super.onStart();
    cm = ((android.net.ConnectivityManager) (com.adsamcik.signalcollector.DataStore.context.getSystemService(Context.CONNECTIVITY_SERVICE)));
}