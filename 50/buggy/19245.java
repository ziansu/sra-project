@java.lang.Override
public void loadAlarmAndCreatePlayer(long id) {
    model.loadAlarm(id);
    musicPlayer.create(new com.moggot.commonalarmclock.domain.music.Music(Music.MUSIC_TYPE.fromInteger(model.getMusicType()), model.getMusicPath()), this);
}