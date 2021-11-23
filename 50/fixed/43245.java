@java.lang.Override
protected void onStop() {
    super.onStop();
    googleApiClient.disconnect();
    fabShow();
    if ((subscriptionTrips) != null) {
        subscriptionTrips.unsubscribe();
    }
    subscription.unsubscribe();
}