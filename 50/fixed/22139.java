public void setPickingEnabled(boolean enabled) {
    if (enabled != (getPickingEnabled())) {
        if (enabled) {
            attachEyePointeeHolder();
        }else {
            detachEyePointeeHolder();
        }
    }
}