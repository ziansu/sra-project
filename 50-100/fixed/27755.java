@java.lang.Override
public com.devicehive.shim.api.Response handle(com.devicehive.shim.api.Request request) {
    com.devicehive.model.DeviceCommand deviceCommand = request.getBody().cast(com.devicehive.model.rpc.CommandInsertRequest.class).getDeviceCommand();
    hazelcastService.store(deviceCommand);
    com.devicehive.model.eventbus.events.CommandEvent commandEvent = new com.devicehive.model.eventbus.events.CommandEvent(deviceCommand);
    eventBus.publish(commandEvent);
    com.devicehive.model.rpc.CommandInsertResponse payload = new com.devicehive.model.rpc.CommandInsertResponse(deviceCommand);
    return com.devicehive.shim.api.Response.newBuilder().withBody(payload).buildSuccess();
}