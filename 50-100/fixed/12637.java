private void displayConfirmDialog() {
    if ((weatherAlertBuffer) != null) {
        nz.ac.elec.agbase.android_agbase_api.agbase_models.Sensor sensor = nz.ac.elec.agbase.android_agbase_db.AgBaseDatabaseManager.getInstance().readSensorWithGuid(weatherAlertBuffer.getDeviceGuid());
        nz.ac.elec.agbase.weather_app.AlertSummaryGenerator summaryGenerator = new nz.ac.elec.agbase.weather_app.AlertSummaryGenerator();
        java.lang.String weatherAlertSummary = ((sensor.name) + "\n") + (summaryGenerator.writeAlertSummary(weatherAlertBuffer));
        nz.ac.elec.agbase.weather_app.dialogs.ConfirmAlertDialog dialog = new nz.ac.elec.agbase.weather_app.dialogs.ConfirmAlertDialog(this, weatherAlertBuffer.getName(), weatherAlertSummary);
        dialog.getDialog().show();
    }
}