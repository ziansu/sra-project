private void set_device_type() {
    if ((((device_info_hashmap.get("ABS_MT_POSITION_X")) == null) && ((device_info_hashmap.get("ABS_MT_POSITION_Y")) == null)) && ((device_info_hashmap.get("BTN_TOUCH")) != null)) {
        typeA = true;
    }else {
        if ((device_info_hashmap.get("ABS_MT_SLOT")) != null) {
            typeMultiB = true;
        }else {
            typeMultiA = true;
        }
    }
}