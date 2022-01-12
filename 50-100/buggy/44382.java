public void setListening(boolean listening) {
    if (listening == (mBatteryListening)) {
        return ;
    }
    mBatteryListening = listening;
    if (mBatteryListening) {
        com.android.systemui.tuner.TunerService.get(getContext()).addTunable(this, com.android.systemui.statusbar.phone.KeyguardStatusBarView.STATUS_BAR_SHOW_BATTERY_PERCENT, com.android.systemui.statusbar.phone.KeyguardStatusBarView.STATUS_BAR_BATTERY_STYLE);
        mBatteryController.addStateChangedCallback(this);
    }else {
        mBatteryController.removeStateChangedCallback(this);
        com.android.systemui.tuner.TunerService.get(getContext()).removeTunable(this);
    }
}