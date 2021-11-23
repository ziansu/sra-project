public static <T> void stopReceiving(final T target) {
    final me.denley.courier.Courier.DeliveryBoy<T> messenger = me.denley.courier.Courier.findDeliveryBoy(target);
    messenger.stopReceiving(target);
}