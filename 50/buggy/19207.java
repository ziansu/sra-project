public void updateTotalDistanceDrivenLabel() {
    driverDistanceDrivenLabel.setText(java.lang.String.format("%.1f", ((drivingHistory.getDistanceThisYear()) + (trip.getTotalDistance()))));
}