private void updateListeners() {
    if (mListening) {
        mSettingsObserver.observe();
        mBatteryController.addStateChangedCallback(this);
        mNextAlarmController.addStateChangedCallback(this);
        mWeatherController.addCallback(this);
    }else {
        mBatteryController.removeStateChangedCallback(this);
        mNextAlarmController.removeStateChangedCallback(this);
        mWeatherController.removeCallback(this);
        mSettingsObserver.unobserve();
    }
}