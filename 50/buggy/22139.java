public void setPickingEnabled(boolean enabled) {
    if (enabled != (getPickingEnabled())) {
        if (enabled) {
            detachEyePointeeHolder();
        }else {
            attachEyePointeeHolder();
        }
    }
}