private void play(java.lang.String path, int seekTo) {
    this.path = path;
    try {
        mp.stop();
        mp.reset();
        mp.setDataSource(path);
        mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp.prepare();
        mp.start();
        mp.seekTo(seekTo);
        seek.setMax(mp.getDuration());
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}