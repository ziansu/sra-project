protected android.support.v4.app.Fragment createFragment() {
    com.innovativetech.audio.audiobookmaster.AudioBook book = ((com.innovativetech.audio.audiobookmaster.AudioBook) (getIntent().getSerializableExtra(com.innovativetech.audio.audiobookmaster.AudioPlayerActivity.EXTRA_BOOK)));
    return com.innovativetech.audio.audiobookmaster.AudioPlayerFragment.newInstance(book);
}