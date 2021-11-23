@java.lang.Override
protected void onStop() {
    super.onStop();
    googleApiClient.disconnect();
    fabShow();
    subscriptionTrips.unsubscribe();
    subscription.unsubscribe();
}