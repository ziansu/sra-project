public static void stop() {
    if ((org.y20k.transistor.helpers.NotificationHelper.mService) != null) {
        org.y20k.transistor.helpers.NotificationHelper.mService.stopForeground(true);
    }
}