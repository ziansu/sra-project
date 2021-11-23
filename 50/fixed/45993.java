@java.lang.Override
public void onServiceDisconnected(android.content.ComponentName componentName) {
    timber.log.Timber.d("Disconnected from service.");
    navigationService = null;
}