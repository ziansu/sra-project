private void onMusicSet(int modeID) {
    if (modeID == 0)
        searchMusic(modeID);
    else {
        boolean isSDPresent = android.os.Environment.getExternalStorageState().equals(android.os.Environment.MEDIA_MOUNTED);
        if (isSDPresent)
            checkMusicPermission();
        else
            android.widget.Toast.makeText(this, R.string.wakeup_music_no_sd_card, Toast.LENGTH_SHORT).show();
        
    }
}