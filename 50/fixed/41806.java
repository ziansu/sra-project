protected android.support.v4.app.Fragment createFragment() {
    return com.innovativetech.audio.audiobookmaster.AudioPlayerFragment.newInstance(((com.innovativetech.audio.audiobookmaster.AudioBook) (getIntent().getSerializableExtra(com.innovativetech.audio.audiobookmaster.AudioPlayerActivity.EXTRA_BOOK))));
}