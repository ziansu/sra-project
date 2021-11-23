private void updateListeners() {
    if (mListening) {
        mSettingsObserver.observe();
        mNextAlarmController.addStateChangedCallback(this);
        mWeatherController.addCallback(this);
    }else {
        mNextAlarmController.removeStateChangedCallback(this);
        mWeatherController.removeCallback(this);
        mSettingsObserver.unobserve();
    }
}