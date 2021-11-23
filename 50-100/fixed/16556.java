private void onMusicSet(int modeID) {
    if (modeID != 0) {
        if (!(android.os.Environment.getExternalStorageState().equals(android.os.Environment.MEDIA_MOUNTED))) {
            android.widget.Toast.makeText(this, R.string.wakeup_music_no_sd_card, Toast.LENGTH_SHORT).show();
            return ;
        }
        if (!(checkMusicPermission()))
            return ;
        
    }
    searchMusic(modeID);
}