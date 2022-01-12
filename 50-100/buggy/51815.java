private void updateDeviceList() {
    _bleDeviceList = _service.getDeviceMap().getRssiSortedList();
    runOnUiThread(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            _txtClosest.setText(getString(R.string.main_closest_device, _bleDeviceList.get(0).getName()));
            nl.dobots.bluenetexample.DeviceListAdapter adapter = ((nl.dobots.bluenetexample.DeviceListAdapter) (_lvScanList.getAdapter()));
            adapter.updateList(_bleDeviceList);
            adapter.notifyDataSetChanged();
        }
    });
}