@java.lang.Override
public void run() {
    if (shouldSpeak) {
        sendMessage((-1));
    }else {
        if ((mRepeatEndMessageTimer) != null) {
            mRepeatEndMessageTimer.cancel();
            mRepeatEndMessageTimer = null;
        }
    }
}