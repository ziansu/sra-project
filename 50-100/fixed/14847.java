private void createDeviceSelector() {
    android.widget.Spinner devicesSpinner = ((android.widget.Spinner) (findViewById(R.id.deviceListForScheduling)));
    android.widget.ArrayAdapter<se.learning.home.androidclient.view.AddNewEventToSchedule.DeviceSpinnerItem> devicesSpinnerArrayAdapter = new android.widget.ArrayAdapter(context, android.R.layout.simple_spinner_item, deviceSpinnerItems);
    devicesSpinnerArrayAdapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
    devicesSpinner.setAdapter(devicesSpinnerArrayAdapter);
    setDeviceSpinnerListener(devicesSpinner);
}