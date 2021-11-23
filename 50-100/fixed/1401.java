@java.lang.Override
public void run() {
    try {
        java.lang.String subFolder = null;
        if (playerId != null) {
            subFolder = playerId.getName();
        }
        final javax.sound.sampled.Clip clip = loadClip(clipName, subFolder, false);
        if (clip != null) {
            clip.setFramePosition(0);
            clip.loop(0);
        }
    } catch (final java.lang.Exception e) {
        games.strategy.debug.ClientLogger.logQuietly(e);
    }
}