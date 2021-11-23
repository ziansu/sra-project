public static <T> void stopReceiving(final T target) {
    final me.denley.courier.Courier.DeliveryBoy<T> messenger = me.denley.courier.Courier.findDeliveryBoy(target.getClass());
    messenger.stopReceiving(target);
}