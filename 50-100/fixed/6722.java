@java.lang.Override
protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    if (requestCode == (MUSIC_LIST_VIEW_REQUEST)) {
        if (resultCode == (android.app.Activity.RESULT_OK)) {
            currentSong = data.getIntExtra("position", 1);
            playSong();
        }
    }
}