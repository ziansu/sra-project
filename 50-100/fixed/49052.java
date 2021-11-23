public void audioPermissionGranted(boolean granted) {
    if ((mDecibelSensorCardPresenter) == null) {
        return ;
    }
    if (granted) {
        startObserving(DecibelSensor.ID, mDecibelSensorCardPresenter);
    }else {
        mDecibelSensorCardPresenter.setConnectingUI(DecibelSensor.ID, true, getActivity().getApplicationContext(), true);
    }
    mDecibelSensorCardPresenter = null;
    updateAvailableSensors();
}