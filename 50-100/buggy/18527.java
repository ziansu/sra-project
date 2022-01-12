public void play(java.util.Collection<java.io.File> musicFiles) {
    try {
        ch.mobpro.vibra.VibraMusicService.VibraPlayMusicTask playTask = new ch.mobpro.vibra.VibraMusicService.VibraPlayMusicTask();
        for (java.io.File musicFile : musicFiles) {
            while (ch.mobpro.vibra.VibraMusicService.mp.isPlaying()) {
                java.lang.Thread.sleep(1000);
            } 
            playTask.execute(musicFile);
        }
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}