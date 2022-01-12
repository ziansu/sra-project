@java.lang.Override
public void onSetStreamVolume(float volume) {
    mLog.d((("[onSetStreamVolume][volume: " + volume) + "]"));
    if (volume == 0.0F) {
        try {
            mDtvManager.setMute();
        } catch (android.os.RemoteException e) {
            e.printStackTrace();
        }
    }else {
        mDtvManager.setVolume((volume * 100));
    }
}