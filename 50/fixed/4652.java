public static cn.junety.alarm.sender.client.impl.DeliveryStatusClient buildDeliveryStatusClient(java.lang.String name, org.springframework.context.ApplicationContext context) {
    return new cn.junety.alarm.sender.client.impl.DeliveryStatusClient(name, ConfigKey.DELIVERY_QUEUE.value(), context);
}