@java.lang.Override
public void run() {
    com.praxisgs.emergencysms.eventbus.PermissionEvents.EventReadContactsPermissionStatusAfterRequest resultEvent = new com.praxisgs.emergencysms.eventbus.PermissionEvents.EventReadContactsPermissionStatusAfterRequest(false);
    com.praxisgs.emergencysms.eventbus.EmergencySMSEventBus.post(resultEvent);
}