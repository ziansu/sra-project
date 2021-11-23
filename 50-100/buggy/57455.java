private void stopPlayerAndSave() {
    stopSong();
    android.content.SharedPreferences sharedPreferences = getSharedPreferences(Constant.MEDIA_STATE, 0);
    sharedPreferences.edit().putString(Constant.SONG, list.get(songIndex).getName()).putInt(Constant.OFFSET, mediaPlayer.getCurrentPosition()).commit();
    updateStateOnParse(songIndex, false);
}