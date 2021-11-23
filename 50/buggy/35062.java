public void setMute(boolean mute) {
    if (mute) {
        this.volume = 0;
    }
    if ((this.mute) != mute) {
        this.mute = mute;
        checkedNotifyObserver();
    }
}