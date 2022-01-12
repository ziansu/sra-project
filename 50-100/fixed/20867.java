private void updateNotification(int currentPositionInPathIndex) {
    double distanceInKm = (route.getElapsedDistance()) / 1000;
    notificationBuilder.setProgress(route.getPathSize(), currentPositionInPathIndex, false);
    notificationManager.notify(se.sensorship.LocationService.NOTIFICATION_ID, notificationBuilder.build());
}