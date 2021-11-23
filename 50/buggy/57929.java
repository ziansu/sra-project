@java.lang.Override
public void updateMusicSource(com.arde.media.common.MusicSource musicSource) {
    indexer.setSelectedMusicSource(musicSource);
    this.musicSource = musicSource;
    musicSource.setReady(false);
    reIndexMusicSource();
}