public void updateLight(boolean enabledLight) {
    if ((mWheelLightEnabled) != enabledLight) {
        com.cooper.wheellog.utils.InMotionAdapter.getInstance().setLightState(enabledLight);
    }
}