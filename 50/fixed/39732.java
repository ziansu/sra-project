@java.lang.Override
public boolean stopSpeak() {
    try {
        if ((mediaPlayer) != null) {
            mediaPlayer.stop();
        }
    } catch (java.lang.IllegalStateException e) {
        return false;
    }
    return true;
}