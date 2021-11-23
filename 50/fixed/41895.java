@java.lang.Override
public void handleMessage(android.os.Message message) {
    switch (message.what) {
        case com.example.blockwatch.BlockwatchFragment.MSG_UPDATE_TIME :
            pV.setCurrentHash(currentHash);
            pV.invalidate();
            break;
    }
}