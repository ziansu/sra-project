@java.lang.Override
protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    super.onActivityResult(requestCode, resultCode, data);
    if (resultCode == (RESULT_OK)) {
        mSongJson = data.getStringExtra(Constants.EXT_SOUND_DATA);
        if (((mSongJson) != null) && ((mSoundPlayer) != null)) {
            mSoundPlayer.play(mSongJson);
            ((android.widget.Button) (this.findViewById(R.id.pause_resume))).setText("暂停播放");
        }
    }
}