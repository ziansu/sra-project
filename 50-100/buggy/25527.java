public void update(java.lang.Boolean wasPlaying, boolean updateState) {
    if (((mBluetooth.getConnectedDevice()) != null) || (mBluetooth.hasConnectedFile())) {
        if ((wasPlaying == null) || wasPlaying) {
            play(updateState);
        }else {
            pause(false, updateState);
        }
    }else {
        pause(false, updateState);
    }
}