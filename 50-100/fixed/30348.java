private void onStatsRefreshed(final com.google.android.apps.forscience.whistlepunk.data.GoosciSensorLayout.SensorLayout sensorLayout) {
    if ((getView()) == null) {
        return ;
    }
    final com.google.android.apps.forscience.whistlepunk.StatsList statsList = ((com.google.android.apps.forscience.whistlepunk.StatsList) (getView().findViewById(R.id.stats_drawer)));
    if (statsList == null) {
        return ;
    }
    loadStatsAndChart(sensorLayout, statsList);
}