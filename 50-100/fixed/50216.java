private static void playClip(itdelatrisu.opsu.audio.MultiClip clip, float volume) {
    if (clip == null)
        return ;
    
    if (volume > 0.0F) {
        try {
            clip.start(volume);
        } catch (javax.sound.sampled.LineUnavailableException e) {
            itdelatrisu.opsu.ErrorHandler.error(java.lang.String.format("Could not start a clip '%s'.", clip.getName()), e, true);
        }
    }
}