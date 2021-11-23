@java.lang.Override
public void onClick(android.view.View v) {
    if (!(mBasicThread.isAlive())) {
        mBasicThread.pause();
        mBasicThread.shut();
    }
    if (!(mSongThread.isAlive())) {
        mSongThread.pause();
        mSongThread.shut();
    }
}