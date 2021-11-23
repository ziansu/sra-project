private void toDevices() {
    if ((devicesFrag) == null) {
        devicesFrag = new com.example.licl.seubdspeed.Fragment.DevicesFragment();
        fragmentTrs.add(R.id.fl_content, devicesFrag);
    }else {
        fragmentTrs.show(devicesFrag);
    }
}