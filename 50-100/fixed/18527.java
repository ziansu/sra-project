public void play(java.util.Collection<java.io.File> musicFiles) {
    try {
        ch.mobpro.vibra.VibraMusicService.VibraPlayMusicTask playTask = new ch.mobpro.vibra.VibraMusicService.VibraPlayMusicTask();
        for (java.io.File musicFile : musicFiles) {
            playTask.execute(musicFile);
        }
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}