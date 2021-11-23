@java.lang.Override
public void onStop() {
    if (!(searchNearbyStoresSubscription.isUnsubscribed())) {
        searchNearbyStoresSubscription.unsubscribe();
    }
    super.onStop();
}