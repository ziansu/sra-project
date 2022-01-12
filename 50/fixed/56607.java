public void updateScaleData(com.health.openscale.core.datatypes.ScaleData scaleData) {
    scaleDB.updateEntry(scaleData.getId(), scaleData);
    alarmHandler.entryChanged(context, scaleData);
    updateScaleData();
}