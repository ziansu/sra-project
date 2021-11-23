public static <T> void startReceiving(final android.content.Context context, final T target) {
    final me.denley.courier.Courier.DeliveryBoy<T> messenger = me.denley.courier.Courier.findDeliveryBoy(target);
    me.denley.courier.Courier.makeWearableApiCall(context, new me.denley.courier.Courier.WearableApiTask() {
        @java.lang.Override
        public void run(com.google.android.gms.common.api.GoogleApiClient apiClient) {
            messenger.startReceiving(apiClient, target);
        }
    });
}