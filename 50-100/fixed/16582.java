@java.lang.Override
public void success(space.collabify.android.models.Song song, retrofit.client.Response response) {
    mHasCurrentSongChanged = false;
    if (((((mCurrentSong) == null) || (song == null)) || ((mCurrentSong.getId()) == null)) || (!(mCurrentSong.getId().equals(song.getId())))) {
        mHasCurrentSongChanged = true;
        mCurrentSong = song;
    }
}