private void handleEmptyQueue(org.eclipse.smarthome.core.types.Command notificationURL, org.eclipse.smarthome.binding.sonos.handler.ZonePlayerHandler coordinator) {
    java.lang.String originalVolume = coordinator.getVolume();
    coordinator.applyNotificationSoundVolume();
    coordinator.playURI(notificationURL);
    waitForFinishedNotification();
    coordinator.removeAllTracksFromQueue();
    coordinator.setVolume(org.eclipse.smarthome.core.library.types.DecimalType.valueOf(originalVolume));
}