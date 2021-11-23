private void resetDeviceName() {
    if (!(tag)) {
        device_num.setText("");
        equipmentID = "";
    }
    getSimpleDescription(DeviceName);
    simple_description.getmEditText().setText("");
    mSimpleDescriptionList.clear();
    tag = false;
}