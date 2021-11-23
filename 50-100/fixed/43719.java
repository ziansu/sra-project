public static void bindHandler(android.content.Context context, boolean isTextMonitoringEnabled, boolean isPhoneMonitoringEnabled) {
    if (isTextMonitoringEnabled) {
        com.attila.wakerupper.Factories.ReceiverFactory._internalBindUnbind(context, com.attila.wakerupper.Receivers.SMSReceiver.class, true);
        com.attila.wakerupper.Factories.ReceiverFactory.resetTextsReceived(context, (-1));
    }
    if (isPhoneMonitoringEnabled) {
        com.attila.wakerupper.Factories.ReceiverFactory._internalBindUnbind(context, com.attila.wakerupper.Receivers.PhoneReceiver.class, true);
    }
}