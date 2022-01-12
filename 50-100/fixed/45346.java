@java.lang.Override
protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    super.onActivityResult(requestCode, resultCode, data);
    if (resultCode == (RESULT_OK)) {
        mSongJson = data.getStringExtra(Constants.EXT_SOUND_DATA);
        if ((mSongJson) != null) {
            play();
        }
    }
}