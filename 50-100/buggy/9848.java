public void setDockBatteryController(com.android.systemui.statusbar.policy.DockBatteryController dockBatteryController) {
    com.android.systemui.DockBatteryMeterView v = ((com.android.systemui.DockBatteryMeterView) (findViewById(R.id.dock_battery)));
    if (dockBatteryController != null) {
        v.setBatteryStateRegistar(dockBatteryController);
        mDockBatteryLevel.setBatteryStateRegistar(dockBatteryController);
    }else {
        if (v != null) {
            removeView(v);
        }
        if ((mDockBatteryLevel) != null) {
            removeView(mDockBatteryLevel);
            mDockBatteryLevel = null;
        }
    }
}