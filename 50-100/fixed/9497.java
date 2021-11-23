@java.lang.Override
public void onSetStreamVolume(float volume) {
    mLog.d((("[onSetStreamVolume][volume: " + volume) + "]"));
    if (volume == 0.0F) {
        try {
            if ((mDtvManager) != null) {
                mDtvManager.setMute();
            }
        } catch (android.os.RemoteException e) {
            e.printStackTrace();
        }
    }else {
        if ((mDtvManager) != null) {
            mDtvManager.setVolume((volume * 100));
        }
    }
}