public static java.lang.String getAverageSpeedText(double distance, long duration) {
    double minutes = (duration / 1000) / 60;
    double kmPerHour = (distance / (minutes / 60)) / 1000;
    return com.kingwaytek.cpami.biking.AppController.getInstance().getString(R.string.track_average_speed_per_hour, new java.text.DecimalFormat("#.00").format(kmPerHour));
}