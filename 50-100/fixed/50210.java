private void reSend(final byte[] deliveryTag, boolean reuseDeliveryTag) {
    com.microsoft.azure.servicebus.ReplayableWorkItem<java.lang.Void> pendingSend = this.pendingSendWaiters.remove(deliveryTag);
    if (pendingSend != null) {
        this.send(pendingSend.getMessage(), pendingSend.getEncodedMessageSize(), pendingSend.getMessageFormat(), pendingSend.getWork(), pendingSend.getTimeoutTracker(), (reuseDeliveryTag ? deliveryTag : null));
    }
}