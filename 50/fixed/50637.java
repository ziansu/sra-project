private void setMeterListeners(jonasandtim.energietagebuch.Data.DataInterfaces.KBRDataHasChangedListener listener) {
    for (jonasandtim.energietagebuch.Data.Meter.Meter m : mMeters) {
        m.setDataHasChangedListener(listener);
    }
}