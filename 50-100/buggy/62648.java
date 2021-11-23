@java.lang.Override
public void onSkipToPrevious() {
    for (int index = 0; index < (smartnsoft.com.androidauto.BeatBoxMusicService.INSTRUMENTS.length); index++) {
        if (currentStream.getString(MediaMetadata.METADATA_KEY_MEDIA_ID).equals(smartnsoft.com.androidauto.BeatBoxMusicService.INSTRUMENTS[index])) {
            currentStream = metadatas.get(smartnsoft.com.androidauto.BeatBoxMusicService.INSTRUMENTS[((index + 1) % (smartnsoft.com.androidauto.BeatBoxMusicService.INSTRUMENTS.length))]);
            break;
        }
    }
    playCurrentStream();
}