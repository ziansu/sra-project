public static boolean isAlive() {
    return ((uk.co.siterwell.cloud.CloudEventHandler.messageBroker) != null) && (uk.co.siterwell.cloud.CloudEventHandler.messageBroker.isAlive());
}