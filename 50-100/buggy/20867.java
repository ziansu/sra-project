private void updateNotification(int currentPositionInPathIndex) {
    double distanceInKm = (route.getElapsedDistance()) / 1000;
    notificationBuilder.setProgress(route.getPathSize(), currentPositionInPathIndex, false);
    notificationBuilder.setContentText((("Distance: " + (java.lang.String.format("%.2d", distanceInKm))) + "km"));
    notificationManager.notify(se.sensorship.LocationService.NOTIFICATION_ID, notificationBuilder.build());
}