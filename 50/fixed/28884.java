public boolean setPlaying(boolean playing) {
    if ((this.playing) != playing) {
        this.playing = playing;
        checkedNotifyObserver();
        return true;
    }
    return false;
}