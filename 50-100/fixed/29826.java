@java.lang.Override
public com.devicehive.shim.api.Response handle(com.devicehive.shim.api.Request request) {
    com.devicehive.model.DeviceNotification notification = ((com.devicehive.model.rpc.NotificationInsertRequest) (request.getBody())).getDeviceNotification();
    hazelcastService.store(notification);
    com.devicehive.model.eventbus.events.NotificationEvent notificationEvent = new com.devicehive.model.eventbus.events.NotificationEvent(notification);
    eventBus.publish(notificationEvent);
    com.devicehive.model.rpc.NotificationInsertResponse payload = new com.devicehive.model.rpc.NotificationInsertResponse(notification);
    return com.devicehive.shim.api.Response.newBuilder().withBody(payload).buildSuccess();
}