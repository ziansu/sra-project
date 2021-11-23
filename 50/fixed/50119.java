@java.lang.Override
public void onStop() {
    if (((searchNearbyStoresSubscription) != null) && (!(searchNearbyStoresSubscription.isUnsubscribed()))) {
        searchNearbyStoresSubscription.unsubscribe();
    }
    super.onStop();
}