@java.lang.Override
void reset(org.sputnikdev.bluetooth.manager.transport.Characteristic characteristic) {
    logger.info(("Disable characteristic notifications: " + (getURL())));
    if (characteristic.isNotifying()) {
        characteristic.disableValueNotifications();
        valueNotification = null;
    }
}