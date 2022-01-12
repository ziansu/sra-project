public void setDevState(com.alperez.bt_microphone.core.DeviceState devState) {
    this.devState = devState;
    notifyPropertyChanged(BR.devState);
}