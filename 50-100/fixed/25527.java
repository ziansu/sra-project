public void update(boolean wasPlaying) {
    if (((mBluetooth.getConnectedDevice()) != null) || (mBluetooth.hasConnectedFile())) {
        if (wasPlaying) {
            play();
        }else {
            pause(false);
        }
    }else {
        pause(false);
    }
}