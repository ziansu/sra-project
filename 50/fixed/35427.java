public void onStop() {
    timber.log.Timber.d("MapboxNavigation onStop.");
    if (isBound) {
        timber.log.Timber.d("unbindService called");
        context.unbindService(connection);
        isBound = false;
    }
}